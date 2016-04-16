package b1.a4;

import java.util.ArrayList;

class Node<T> {
	private T content;
	private ArrayList<Node<T>> children;

	public Node(T t) {
		content = t;
		children = new ArrayList<Node<T>>();
	}

	public void add(Node<T> node) {
		children.add(node);
	}

	public T getContent() {
		return content;
	}
	
	private void rec_traverse(Handler<T> h){
		if(h == null){
			h = new Handler<T>();
		}
		h.handle(content);
		for(Node<T> child : children){
			child.rec_traverse(h);
		}
	}
	
	public void traverse(){
		rec_traverse(null);
	}
}
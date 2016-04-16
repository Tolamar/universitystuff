package b1.a4;

import java.util.ArrayList;

class SuperNode<T> {
	private T content;
	private ArrayList<SuperNode<T>> children;

	public SuperNode(T t) {
		content = t;
		children = new ArrayList<SuperNode<T>>();
	}

	public void add(SuperNode<T> node) {
		children.add(node);
	}

	public T getContent() {
		return content;
	}
	
	private void rec_traverse(ContentHandler<? super T> h) throws Exception{
		if(h == null){
			throw new Exception("no handler");
		}
		h.handle(content);
		for(SuperNode<T> child : children){
			child.rec_traverse(h);
		}
	}
	
	public void traverse( ContentHandler<? super T> h) throws Exception{
		rec_traverse(h);
	}
}
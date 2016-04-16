package b1.a2;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	
	public class Entry{
		public Entry(){
		}
		public Entry next;
		public T item;
	}
	
	public Entry first = null;
	public Entry last = null;
	
	
	public void add(T item){
		Entry e = new Entry();
		e.item = item;
		if(first == null){
			first = e;
			last = e;
		}else{
		last.next = e;
		last = e;
		}
	}
	
	public class listIter implements Iterator<T>{

		LinkedList<T> target;
		Entry current;
		
		public listIter(LinkedList<T> ll) {
			target = ll;
		}

		@Override
		public boolean hasNext() {
			return current.next != null;
		}

		@Override
		public T next() {
			T val = current.next.item;
			current = current.next;
			return val;
		}

	}

	@Override
	public Iterator<T> iterator() {
		return new listIter(this);
	}
}

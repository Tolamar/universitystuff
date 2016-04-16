package b1.a2;

import java.util.Iterator;

public class FieldList<T> implements Iterable<T>{

	private int last = -1;
	Object elements[];	

	public FieldList(){
		/* macht man das so?? Oder gibt es einen anderen
		 * weg um new T[]()zu umgehen.. */		
		elements = new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	public FieldList(int size){
		elements = (T[]) new Object[size];
	}

	public void add(T item)
	{
		/*array voll, erweitern*/
		if(elements.length == (last+1)){
			Object[] tmp = new Object[elements.length + 10];
			System.arraycopy(elements, 0, tmp, 0, elements.length);
			elements = tmp;
		}
		
		elements[++last] = item;
	}

	public class listIter implements Iterator<T>{

		Object[] target;
		int current;
		
		public listIter(Object[] elements) {
			target = elements;
		}

		@Override
		public boolean hasNext() {
			return target.length >= current+1&&target[current+1] != null;
		}

		@Override
		public T next() {
			Object val = target[++current];
			return (T) val;
		}

	
	}

	@Override
	public Iterator<T> iterator() {
		return new listIter(elements);
	}
}

package b1.a1;

import java.util.ArrayList;

public class Polygon<N extends Number,P extends Point2D<N>> {

	ArrayList<P> list;

	public Polygon() {
		list = new ArrayList<P>();
	}
	
	public void add(P point){
		list.add(point);
	}
	
	
	public P get(int index){
		return list.get(index);
	}
	
	public void remove(int index){
		list.remove(index);
	}

}

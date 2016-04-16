package b1.a3;

public class BottleBoxC<T extends Bottle<?>> {

	/*actually T not object*/
	private Bottle<?>[] box; 
	
	public BottleBoxC(){
		box = new Bottle<?>[24];
	}

	public void add(T b, int index) throws IndexOccupiedException{
		if(box[index] != null){
			throw new IndexOccupiedException();
		}
		
		box[index] = b;
	}
	
	public T remove(int index){
		T tmp = (T) box[index];
		box[index] = null;
		return tmp;
	}

}

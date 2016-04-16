package b1.a3;

public class BottleBoxB {
	/*actually T not object*/
	private Bottle<?>[] box; 
	
	public BottleBoxB(){
		box = new Bottle<?>[24];
	}

	public void add(Bottle<?> b, int index) throws IndexOccupiedException{
		if(box[index] != null){
			throw new IndexOccupiedException();
		}
		
		box[index] = b;
	}
	
	public Bottle<?> remove(int index){
		Bottle<?> tmp = box[index];
		box[index] = null;
		return tmp;
	}

}

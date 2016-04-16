package b1.a3;

public class BottleBoxA<T extends Drink> {

	private Bottle<?>[] box; 
	
	public BottleBoxA(){
		box = new Bottle<?>[24];
	}

	public void add(Bottle<T> bottle, int index) throws IndexOccupiedException{
		if(box[index] != null){
			throw new IndexOccupiedException();
		}
		box[index] = bottle;
	}
	
	public Bottle<T> remove(int index){
		Bottle<T> tmp = (Bottle<T>) box[index];
		box[index] = null;
		return tmp;
	}

}

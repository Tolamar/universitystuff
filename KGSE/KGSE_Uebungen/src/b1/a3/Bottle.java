package b1.a3;

public class Bottle<T extends Drink> {

	T content;
	
	public void fill(T liquid){
		this.content = liquid;
	}
	
	public void empty(){
		content = null;
	}
}

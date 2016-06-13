package introDuck;

public class RubberDuck extends Duck{
	
	@Override
	public void quack(){
		System.out.println("Squeak Squeak");
	}
	
	@Override
	public void display() {
		this.setDuckType("Rubber Duck");
		super.display();
	}
}

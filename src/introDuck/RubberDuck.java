package introDuck;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		this.setRealDuck(false);
	}
	
	@Override
	public void quack(){
		System.out.println("Squeak Squeak");
	}
	
	@Override
	public void display() {
		this.setDuckType("Rubber Duck");
		super.display();
	}
	
	@Override
	public void fly() {
		//do nothing
	}
}

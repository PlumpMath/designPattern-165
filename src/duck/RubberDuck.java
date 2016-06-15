package duck;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		this.setRealDuck(false);
	}
	
	
	@Override
	public void display() {
		this.setDuckType("Rubber Duck");
		super.display();
	}
	

}

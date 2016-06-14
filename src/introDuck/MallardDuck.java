package introDuck;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		this.setRealDuck(true);
	}
	
	@Override
	public void display() {
		this.setDuckType("Mallard Duck");
		super.display();
	}

}

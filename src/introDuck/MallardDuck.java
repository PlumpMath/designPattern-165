package introDuck;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		this.setRealDuck(true);
	}
	
	@Override
	public void display() {
		this.setDuckType("Mallard Duck");
		super.display();
	}

}

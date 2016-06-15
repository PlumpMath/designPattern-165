package duck;

import duckBehaviors.FlyNoWay;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
		
	}
	
	
	
	
	@Override
	public void display() {
		this.setDuckType("Decoy Duck");
		super.display();
	}
}

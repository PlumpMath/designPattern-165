package introDuck;

public class Runner {
	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();
		mDuck.display();
		mDuck.fly();
		
		
		
		RubberDuck rDuck = new RubberDuck();
		rDuck.quack();
		rDuck.fly();
		
		
		RedHeadDuck rhDuck = new RedHeadDuck();
		rhDuck.display();
		
	}

}

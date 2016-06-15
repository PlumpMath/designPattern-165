package duck;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		this.setRealDuck(true);
		
	}
	
	
	@Override
	public void display() {
		this.setDuckType("Redhead Duck" + this.isRealDuck());
		super.display();
	}

}

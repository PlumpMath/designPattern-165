package introDuck;

public class DecoyDuck extends Duck{
	
	

	
	@Override
	public void quack(){
		// do nothing because decoy duck is not alive
	}
	
	@Override
	public void fly() {
		// do nothing because decoy duck is not alive
	}
	
	@Override
	public void display() {
		this.setDuckType("Decoy Duck");
		super.display();
	}
}

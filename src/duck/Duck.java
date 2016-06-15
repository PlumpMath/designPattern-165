package duck;

import duckBehaviors.FlyBehavior;
import duckBehaviors.QuackBehavior;

public class Duck {
	
	private int id;
	private String duckType;
	private String duckDescription;
	private boolean isRealDuck;
	
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	
	public Duck() {
		super();
	}
	
	public Duck(int id, String duckType, String duckDescription, boolean isRealDuck) {
		super();
		this.id = id;
		this.duckType = duckType;
		this.duckDescription = duckDescription;
		this.isRealDuck = isRealDuck;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDuckType() {
		return duckType;
	}
	public void setDuckType(String duckType) {
		this.duckType = duckType;
	}
	public String getDuckDescription() {
		return duckDescription;
	}
	public void setDuckDescription(String duckDescription) {
		this.duckDescription = duckDescription;
	}
	public boolean isRealDuck() {
		return isRealDuck;
	}
	public void setRealDuck(boolean isRealDuck) {
		this.isRealDuck = isRealDuck;
	}
	
	public void display(){
		System.out.println("Duck Name is " + this.getDuckType());
	}
	
	public void swim(){
		System.out.println("//The duck is swimming !");
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	
	


}

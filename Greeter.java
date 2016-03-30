package chapter1;

public class Greeter {

	public void sayHello(String name) {
		//System.out.print("From: " + this.getClass() + "(" + this.hashCode() + ") : ");
		System.out.println("Hello, world! I am " + this.getClass().getSimpleName() + "(" + this.getID() + ")");
	}
	
	public int getID() {
		return(this.hashCode());
	}
	
	public String getDeathThreat() {
		return "You are so dead -> Kind regards " + this.getClass().getSimpleName() + "(" + this.getID() + ")";
	}
	
}
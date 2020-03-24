package comparableAnimals;

public class Wombat extends Animal{
	
	Wombat(){
		this.weight = 1800;
		this.name = "Anonymous Wombat";
	}
	
	public void eat(int weight) {
		System.out.println("Wombats do not eat!");
	}

	Wombat(int weight, String name) {
		super(weight, name);
		// TODO Auto-generated constructor stub
	}
	
}

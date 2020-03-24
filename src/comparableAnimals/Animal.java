package comparableAnimals;

public class Animal implements Comparable<Animal> {
	int weight = 1800;
	String name;
	
	Animal(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	Animal(){
	}
	
	public void eat(int food) {
		weight+= food;
	}
	

	@Override
	public int compareTo(Animal other) {
		// TODO Auto-generated method stub
		return weight - other.weight;
	}
}
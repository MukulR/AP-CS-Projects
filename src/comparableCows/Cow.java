package comparableCows;

public class Cow implements Comparable<Cow> {
	private int weight;
	private String name;
	
	public Cow(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public Cow() {
		this(1800, "Anonymous Cow");
	}
	
	public int getWeight() {
		return weight;
	
	}
    public String getName() { 
    	return name; 
    }

	@Override
	public int compareTo(Cow o) {
		// TODO Auto-generated method stub
		return (weight - o.getWeight());
	}
	
	public String toString() {
		return name;
	}
}

package randp;

public class Main {
	public static void main(String[] args) {
		Randp rp = new Randp(5);
		for (int i = 0; i < rp.size(); i++) {
			System.out.print(rp.nextInt() + " ");
		}
	}
}

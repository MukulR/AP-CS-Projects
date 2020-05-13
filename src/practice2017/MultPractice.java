package practice2017;

public class MultPractice implements StudyPractice{
	private int firstInteger;
	private int secondInteger;
	
	public MultPractice(int first, int second) {
		firstInteger = first;
		secondInteger = second;
	}
	
	
	@Override
	public String getProblem() {
		return firstInteger + " TIMES " + secondInteger; 
	}
	
	@Override
	public void nextProblem() {
		secondInteger++;
	}
}

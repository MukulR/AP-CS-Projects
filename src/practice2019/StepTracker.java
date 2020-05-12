package practice2019;

public class StepTracker {
	private int minSteps = 0;
	private int totalSteps = 0;
	private int numActiveDays = 0;
	private int daysWalked = 0;

	public StepTracker(int minSteps){
		this.minSteps = minSteps;
	}

	public void addDailySteps(int steps){
		if (steps > minSteps){
			numActiveDays++;
		}
		totalSteps += steps;
		daysWalked++;
	}

	public int activeDays() {
		return numActiveDays;
	}

	public double averageSteps() {
		if (daysWalked == 0){
			return 0.0;
		}
		return totalSteps / daysWalked;
	}
}

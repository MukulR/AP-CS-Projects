package practice2017;

public class Position {
	/** Constructs a position object with row r and column c */
	public Position(int r, int c) {
		/* implementation not shown */
	}
	
	public static Position findPosition(int num, int[][] intArr) {
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[0].length; j++) {
				if(intArr[i][j] == num) {
					return new Position(i, j);
				}
			}
		}
		return null;
	}
	
	public static Position[][]	getSuccessorArray(int[][] intArr){
		int successor;
		Position[][] successorArr = new Position[intArr.length][intArr[0].length];
		for(int i = 0; i < intArr.length; i++) {
			for(int j = 0; j < intArr[0].length; j++) {
				successor = intArr[i][j]+1;
				 successorArr[i][j] = findPosition(successor, intArr);
			}
		}
		return successorArr;
	}
}

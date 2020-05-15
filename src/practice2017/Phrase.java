package practice2017;

public class Phrase {
	private String currentPhrase;
	
	public int findNthOccurence(String str, int n) {
		return 1; // for sake of compilation
	}
	
	public void replaceNthOccurence(String str, int n, String repl) {
		if(findNthOccurence(str, n) != -1) {
			currentPhrase = currentPhrase.substring(0, findNthOccurence(str, n)) + repl +
							currentPhrase.substring(findNthOccurence(str,n) + str.length());
		}
	}
	
	public int findLastOccurence(String str) {
		int index = 1;
		while(findNthOccurence(str, index + 1) != -1) {
			index++;
		}
		return findNthOccurence(str, index);
	}
}

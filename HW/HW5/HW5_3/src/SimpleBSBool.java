
public class SimpleBSBool {
	int [] locationCells;
	int numOfHits = 0;
	boolean[] hitCells;
	public void setLocationCells(int[] locs) {
		locationCells = locs;
		
		hitCells = new boolean[locs.length];
		for(int i = 0; i < hitCells.length; i++) {
			hitCells[i] = false;
		}
	}
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int i = 0; i < locationCells.length; i++) {
			if (guess == locationCells[i]) {
				if(hitCells[i] == true)
					break;
				
				result = "hit";
				numOfHits++;
				hitCells[i] = true;
				
			}
		}

		if(numOfHits == locationCells.length) {
			result = "kill";}
		System.out.println(result);
		return result;
		}
		
	}


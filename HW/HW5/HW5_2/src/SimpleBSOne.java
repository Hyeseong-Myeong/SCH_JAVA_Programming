
public class SimpleBSOne {
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs)	{
		locationCells = locs;
	}
	
	public String checkYourself(String StringGuess)	{
		int guess = Integer.parseInt(StringGuess);
		String result = "miss";
		for (int i = 0 ; i < locationCells.length; i++)	{
			if(guess == locationCells[i])	{
				result = "hit";
				numOfHits++;
				locationCells[i] = -1;
				break;
			}
		}
		
		if(numOfHits == locationCells.length)	{
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}

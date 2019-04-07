
public class HW1_2 {
	public static void main(String[] args)	{
		int[] nums = new int[5];
		
		int i = 0;
		while (i < 5) {
			nums[i] = i + 1;
			i++;
		}
		
		i = 0;
		while (i < 5)	{
			System.out.println("nums[" + i + "] : " + nums[i]);
			i++;
		}
	}
}

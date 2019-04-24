
public class MyArrayList {
	public static void main(String[] args)	{
		int[] arr = {0, 1, 2, 3, 4 };
		int[] newarr = new int [arr.length - 1];
		
		int token = 3;
		
		for(int j = 0; j < arr.length; j++)	{
			if(j < token) newarr[j] = arr[j];
			if(j == token) ;
			if(j > token) newarr[j-1] = arr[j];
		}
		
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
		
		for (int i : newarr)
			System.out.print(i + " ");
		System.out.println();
		
	}
}

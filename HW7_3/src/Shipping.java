
public class Shipping {
	public static void main(String[] args)	{
		BoxWeight[] boxws = new BoxWeight[2];
		
		boxws[0] = new BoxWeight(1, 2, 3, 4);
		boxws[1] = new BoxWeight(2, 3);
		
		System.out.println(boxws[0].cost());
		System.out.println(boxws[1].cost());
	}
}

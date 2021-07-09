
public class CalculatorInterface {
	public static void main(String[] args)	{
		Calculator c = new Calculator();
		double[] arr = {3, 2};
		
		System.out.println(c.add(arr));
		System.out.println(c.subtract(arr));
		System.out.println(c.multiply(arr));
		System.out.println(c.divide(arr));
	}
}

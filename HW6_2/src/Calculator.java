
public class Calculator implements AddSub, MulDiv {
	
	@Override
	public double add(double[] a)	{
		return (a[0] + a[1]);
	}
	
	@Override
	public double subtract(double[] a)	{
		return a[0] - a[1];
	}
	
	@Override
	public double multiply(double[] a)	{
		return a[0] * a[1];
	}
	
	@Override
	public double divide(double[] a)	{
		return a[0] / a[1];
	}
}


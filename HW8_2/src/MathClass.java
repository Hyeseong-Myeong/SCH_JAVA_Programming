
public class MathClass {
	public static void main(String[] args) {
		double d = 13.51;
		System.out.printf("The ceiling of d is " + "%d\n",Math.round(d));
		System.out.printf("The floor of d is " + "%d\n" , (int)Math.floor(d));
		System.out.printf("The rint of d is " + "%d\n", (int)Math.rint(d));
		System.out.printf("The exp(d) is " + "%.1f\n", Math.exp(d)); 
		System.out.printf("The log(d) is " + "%.1f\n" ,Math.log(d));
		System.out.printf("The pow(d,2) is " + "%.1f\n", Math.pow(d, 2));
		System.out.printf("The sqrt(d) is " + "%.1f\n" , Math.sqrt(d));
		System.out.printf("The sine of PI/4 is "  + "%.1f\n",Math.sin(Math.PI/4));
		System.out.printf("The cosine of PI/4 is " + "%.1f\n", Math.cos(Math.PI/4));
		System.out.printf("The tangent of PI/4 is " + "%.1f\n", Math.tan(Math.PI/4));
	}
}
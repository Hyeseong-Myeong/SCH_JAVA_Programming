
public class HW1_1 {
	public static void main(String[] args)	{
		int x = 3, y = 2, z = 5;
		float fa = 2.3F, fb = 4.5F;
		char ca = 'D', cb = 'E';
		float fres = (x * y / z) /fa;
		int ires = (int)(x / 2.3);
		
		System.out.println("x + y - z produces "+ (x + y - z ));
		System.out.println("(x * y / z) / fa produces" + fres);
		System.out.println("x / 2.3 produces" + ires);
		System.out.println("fa / x > = fb / 2 evaluates to " + (fa / x >= fb / 2));
		System.out.println("ca < cb evaluates to " + (ca < cb));
		System.out.println("fa * 3 != z / 2.4 evaluates to " + (fa * 3 != z / 2.4));
		System.out.println("(fa * z >= 3.5) && (fb * x <= 1.7) ecaluates to " + ((fa * z >= 3.5) && (fb * x <= 1.7)));
		System.out.println("!(fb * 3 < 5) ecaluates to " + !(fb *3 < 5));
		System.out.println("y++ == 3 evaluates to " + (y++ == 3));
		System.out.println("++x == -- z evaluates to " + (++x == --z));
		
	}
}


public class ArrayObjects {
	public static void main(String[] args)	{
		Dog[] pets = new Dog[5];
		pets[0] = new Dog();
		pets[1] = new Dog();
		pets[2] = new Dog();
		pets[3] = new Dog();
		pets[4] = new Dog();
		
		int i =0;
		while( i < 5)	{
			pets[i].size = 10*(i+1);
			i++;
		}
		
		i = 0;
		while (i < 5) {
			int j =0;
			System.out.print("Dog[" + i + "]: size = " + pets[i].size + ", ");
			while (j < (i + 1)) {
				pets[i].bark();
				j++;
			}
			i = i + 1;
			System.out.println();
		}
	}
}

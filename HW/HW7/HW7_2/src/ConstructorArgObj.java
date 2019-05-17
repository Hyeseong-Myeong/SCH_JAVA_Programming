
public class ConstructorArgObj {
	public static void main(String[] args)	{
		Cuboid[] cubs = new Cuboid[4];
		
		cubs[0] = new Cuboid();
		cubs[1] = new Cuboid(1, 2, 3);
		cubs[2] = new Cuboid(2);
		cubs[3] = new Cuboid(cubs[1]);
		
		for(Cuboid b:cubs)
			System.out.println((double)b.height*b.length*b.width);
	}
}

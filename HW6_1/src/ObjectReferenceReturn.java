
public class ObjectReferenceReturn {
	public static void main(String[] args)	{
		Dog d1 = new Dog();
		Dog d2;
		Obj ob = new Obj();
		
		ob.setDog(d1);
		d2 = (Dog)ob.getDog();
		
		System.out.println(d1.getClass());
		System.out.println(d2.getClass());
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}

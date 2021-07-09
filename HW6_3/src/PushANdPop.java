
public class PushANdPop {
	public static void main(String[] args)	{
		MyIntStack mis = new MyIntStack();
		mis.push(7);
		mis.push(3);
		mis.push(12);
		mis.push(5); 
		
		for(int i = 0; i < 4; i++)
			System.out.println(mis.pop());
	}
}

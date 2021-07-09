
public class MyIntStack implements MyStack {
	
	private final int MAX = 3;
	private int[] stack = new int[MAX];
	private int index = -1;
	
	@Override
	public void push(int n)	{
		if(index < MAX-1)	{
			stack[++index] = n;
		}else {
			System.out.println("Stakc is full!");
		}
	}
	
	@Override
	public int pop()	{
		if(index < MAX && index > -1)	{
			return stack[index--];
		}else	{
			System.out.println("Stack is empty!");
			return 0;
		}
	}
	
}

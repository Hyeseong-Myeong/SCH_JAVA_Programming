
public class SwitchString {
	public static void main(String[] args)	{
		String[] strs = {"Java", "C", "C++", "C#", "Python"};
		
		for(String x : strs) {
			System.out.print("We have ");
			switch(x)	{
			case "Java" :
			case "C"	:
				System.out.println("learned " + x + ".");
				break;
			case "C++"	:
			case "C#"	:
			case "Python" :
				System.out.println("not learned " + x + " yet.");
				break;
			}
			
		}
	}
}

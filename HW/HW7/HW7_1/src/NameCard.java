
public class NameCard {
	private String name;
	private int id;
	
	public NameCard()	{
		this.name = "Java";
		this.id = 111111111;
	}
	
	public NameCard(String s)	{
		this.name = s;
		this.id = 11111111;
	}
	
	public NameCard(int i)	{
		this.name = "Java";
		this.id = i;
	}
	
	public NameCard(String s, int i)	{
		this.name = s;
		this.id = i;
	}
	
	public String getName()	{return name;}
	public int getId()	{return id;}
}

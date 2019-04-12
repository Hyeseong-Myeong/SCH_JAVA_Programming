
public class RPS {
	private String comStr;
	void setCom(String s)	{comStr = s; }
	
	String checkCom(String usrStr)	{
		String result = "draw";
		switch (usrStr)	{
		case "rock":
			switch(comStr)	{
			case "scissors" : result = "win"; break;
			case "paper": result = "lost"; break;
			}break;
		case "paper" :
			switch (comStr)	{
			case "rock": result = "win"; break;
			case "scissors": result = "lost"; break;
			}break;
		case "scissors":
			switch (comStr)	{
			case "paper": result = "win"; break;
			case "rock": result = "lost"; break;
			}break;
			default: break;
	}
	return result;
	}
}

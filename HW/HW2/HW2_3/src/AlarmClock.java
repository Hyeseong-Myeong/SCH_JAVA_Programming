
public class AlarmClock {
	private int AlarmTime;
	private int AlarmNum;

	
	public void setAlarmTIme(int t) {
		AlarmTime = t;
	}
	
	public int getAlarmTime()	{
		return AlarmTime;
	}
		
	
	public void setNumOfAlarm(int n)	{
		AlarmNum = n;
	}
	
	public void ring()	{
		for(int i = 0; i < AlarmNum; i ++) {
			System.out.print("Ring!");
		}
	}
}

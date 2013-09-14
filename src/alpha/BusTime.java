package alpha;

public class BusTime {
	public int hour;
	public int minute;
	public BusTime(String t){
		if (t.equals("x")){
			hour = -1;
			minute = -1;
		}else{
			String[] time = t.split(":");
			hour = Integer.parseInt(time[0]);
			minute = Integer.parseInt(time[1]);
		}
	}
}

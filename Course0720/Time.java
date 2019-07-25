// Time	时:分:秒

public class Time{
	public int hour;
	public int minute;
	public int second;
	
	public Time(int hour,int minute,int second){
		if(hour<1||hour>23){
			System.err.println("error");
			return;
		}
		if(minute<1||minute>59){
			System.err.println("error");
			return;
		}
		if(second<1||second>59){
			System.err.println("error");
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public Time after(int seconds){
		second+=seconds;
		if(second>59){
		    minute=minute+(second/60);
			hour=hour+(minute/60);
			second=second%60;
			if(minute>59){
			    minute=minute%60;
		    }
		    if(hour>24){
			    hour=hour%24;
		    }
		}
		return this;
	}

	public static void main(String[] args){
		Time a=new Time(16,34,20);
		Time t=a.after(40);
		System.out.println(t.toString());
	}
}

package assignment;
class Date{
	private int day;
	private int month;
	private int year;
	
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void displayDate() {
		System.out.println("Date :"+day+"/"+month+"/"+year);
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day=day;
	}
}
public class Q1 {

	public static void main(String[] args) {
		
		Date date=new Date(13,05,2005);
		date.displayDate();
		System.out.println("the year = "+date.getYear());
		date.setDay(20);
		date.displayDate();
	}

}

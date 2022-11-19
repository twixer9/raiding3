//BEGINNING OF IRON-1
public class Date {
    private int year;
    private int month;
    private int day;
    public Date(){
        int year = 2005;
        int day= 9;
        int month = 8;
    }
    public Date(int rMonth, int rDay, int rYear){
        year = rYear;
        day= rDay;
        month = rMonth;
    }


    public void setYear( int rYear){
        year = rYear;

    }
    public int getYear(){
        return year;
    }
    public void setMonth( int rMonth){
        month = rMonth;

    }
    public int getMonth(){
        return month;
    }
    public void setDay( int rDay){
        day = rDay;

    }
    public int getDay(){
        return day;
    }

    @Override
    public String toString(){
        return "Here is your date:" + month + "/" + day + "/" + year + "\n" +
                "month:" + month + "\n"+
                "day:" + day + "\n"+
                "year:" + year ;
    }

}//THIS MARKS THE END OF IRON-1


package employeeapp;

public class Date {
    private int day,month,year;

    public Date() {
        day = month = 1;
        year = 1970;
    }

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day >= 1 && day <= 30 ? day : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month >= 1 && month <= 12 ? month : 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public String getDate() {
        return day + "/" + month + "/" + year;
    }
    
}

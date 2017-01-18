/**
 * Created by hyunchoi on 1/9/17.
 * Holds the information for "Date"
 */
public class Date {
    private int year;
    private int month;
    private int day;
    private int numDays;

    // constructor
    public Date(int inputYear, int inputMonth, int inputDay) {
        year = inputYear;
        month = inputMonth;
        day = inputDay;

        if (inputMonth == 2) {
            numDays = 28;

            if (inputYear % 4 == 0) {
                // deals with leap years
                numDays = 29;
            }
        }
        else if (inputMonth == 1 || inputMonth == 3 || inputMonth == 5 ||
                inputMonth == 7 || inputMonth == 8 || inputMonth == 10 ||
                inputMonth == 12) {
            numDays = 31;
        }
        else {
            numDays = 30;
        }
    }

    // default constructor
    public Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
        this.numDays = 0;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getNumDays() { return numDays; }

    // won't really use the below three
    public void setYear(int inputYear) {
        year = inputYear;
    }

    public void setMonth(int inputMonth) {
       month = inputMonth;
    }

    public void setDay(int inputDay) {
        day = inputDay;
    }
}

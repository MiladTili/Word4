import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarGenerator {
    private int year;
    private int startDay;

    public CalendarGenerator(int year, int startDay) {
        this.year = year;
        this.startDay = startDay;
    }

    public void generateCalendar() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear()){
            daysInMonth[1] = 29;
        }
         System.out.println("Year: " + year);
        for(int month=0; month<12; month++){
            System.out.println("\n" + months[month]);

            // Print weekday names
            System.out.println("Su Mo Tu We Th Fr Sa");

            // Print leading spaces
            for(int i=0; i<getDay(month, 1); i++){
                System.out.print("   ");
            }

            // Print days of the month
            for(int day=1; day<=daysInMonth[month]; day++){
                System.out.printf("%2d ", day);
                if((day + getDay(month, 1)) % 7 == 0){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    private boolean isLeapYear() {
        if(year % 400 == 0){
            return true;
        }
             else if (year % 100 == 0){
            return false;
        } else if (year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }

    private int getDay(int month, int day) {
        Calendar cal = new GregorianCalendar(year, month, day);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        return (weekday - startDay + 7) % 7;
    }
}
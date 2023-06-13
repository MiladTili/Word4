import java.util.Calendar;

public class MainCalendarGenerator {
    public static void main(String[] args) {
        int year = 2023;
        int startDay = Calendar.SUNDAY;

        CalendarGenerator calendarGenerator = new CalendarGenerator(year, startDay);
        calendarGenerator.generateCalendar();
    }
}

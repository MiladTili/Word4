import java.time.LocalDate;

public class DayOfYearCalculator {
    private int year;
    private int month;
    private int day;

    public DayOfYearCalculator(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int calculateDayOfYear() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfYear();
    }
}

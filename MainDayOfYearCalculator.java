public class MainDayOfYearCalculator{
public static void main(String[] args) {
        int year = 2004;
        int month = 12;
        int day = 31;

        DayOfYearCalculator calculator = new DayOfYearCalculator(year, month, day);
        int dayOfYear = calculator.calculateDayOfYear();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Day of year: " + dayOfYear);
    }
}
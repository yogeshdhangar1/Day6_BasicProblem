import java.time.*;
public class DayOfWeek {
    public static void main(String[] args) {
        LocalDate localDate
                = LocalDate.of(2018,
                Month.AUGUST, 19);
        // get value from locateDate
        java.time.DayOfWeek dayOfWeek
                = java.time.DayOfWeek.from(localDate);
        System.out.println("Day of the Week on"
                + " 19th July 2018- "
                + dayOfWeek.name());
        int val = dayOfWeek.getValue();
        System.out.println("Int Value of "
                + dayOfWeek.name()
                + " - " + val);
    }
}


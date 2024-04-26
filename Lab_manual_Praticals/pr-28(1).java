import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create and populate ArrayList with weekdays
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        // Display contents of ArrayList (weekdays)
        System.out.println("Weekdays:");
        for (String day : weekdays) {
            System.out.println(day);
        }
    }
}

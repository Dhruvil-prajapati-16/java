import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
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

        // Create and populate LinkedList with months
        List<String> months = new LinkedList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Display contents of ArrayList (weekdays)
        System.out.println("Weekdays:");
        for (String day : weekdays) {
            System.out.println(day);
        }
        System.out.println();

        // Display contents of LinkedList (months)
        System.out.println("Months:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

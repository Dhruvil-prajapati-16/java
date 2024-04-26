import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
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

        // Display contents of LinkedList (months)
        System.out.println("Months:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

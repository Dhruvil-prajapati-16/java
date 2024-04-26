import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a new HashSet to store colors
        Set<String> colors = new HashSet<>();

        // Add colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Iterate through all elements using for-each loop to display the collection
        System.out.println("Colors in the HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

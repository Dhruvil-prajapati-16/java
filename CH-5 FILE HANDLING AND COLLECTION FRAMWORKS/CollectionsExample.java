import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("C++");
        
        System.out.println("ArrayList:");
        for (String arraydata : arrayList) {
            System.out.println(arraydata);
        }
    
        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("C++");
        
        System.out.println("LinkedList:");
        for (String linkdata : linkedList) {
            System.out.println(linkdata);
        }

        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add("Java"); // Duplicate element
        
        System.out.println("HashSet:");
        for (String hashdata : hashSet) {
            System.out.println(hashdata);
        }
        
        // TreeSet example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("C++");
        treeSet.add("Python");
        
        System.out.println("TreeSet:");
        for (String treeData : treeSet) {
            System.out.println(treeData);
        }

        // HashMap example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "Python");
        
        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // TreeMap example
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(2, "C++");
        treeMap.put(3, "Python");
        
        System.out.println("TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

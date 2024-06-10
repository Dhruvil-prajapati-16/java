import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("C++");
        
        System.out.println("ArrayList:");
        for (String arraydata : arrayList)
         {
            System.out.println(arraydata);
        }
    
        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("C++");
        
        System.out.println("LinkedList:");
        for (String linkdata : linkedList) {
            System.out.println(linkdata);
        }
/*
 ArrayList:
Java
C++
C++
LinkedList:
Java
C++
C++
 */
        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add("Java"); 
        
        System.out.println("HashSet:");
        for (String hashdata : hashSet) 
        {
            System.out.println(hashdata);
        }
//         HashSet:
// Java
// C++
        
        // TreeSet example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("C++");
        
        System.out.println("TreeSet:");
        for (String treeData : treeSet) 
        {
            System.out.println(treeData);
        }

        /* 
         TreeSet:
          C++
          Java
        */

        // HashMap example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        
        System.out.println("HashMap:" + hashMap);


        // TreeMap example
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // HashMap:{1=Java, 2=C++, 3=Python}
        treeMap.put(1, "Java");
        treeMap.put(2, "C++");
        
        System.out.println("TreeMap:" + treeMap); // TreeMap:{1=Java, 2=C++, 3=Python}

    }
}
/*
 ArrayList:
Java
C++
C++
LinkedList:
Java
C++
C++
HashSet:
Java
C++
TreeSet:
C++
Java

 */
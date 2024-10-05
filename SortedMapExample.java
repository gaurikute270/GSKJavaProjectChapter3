package Collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> marks = new TreeMap<>();
        marks.put("John", 85);
        marks.put("Alice", 95);
        marks.put("Bob", 80);

        System.out.println("Sorted Marks: " + marks);
    }
}


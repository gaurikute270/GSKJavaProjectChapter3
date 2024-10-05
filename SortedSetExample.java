package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Sorted Names: " + names);
    }
}

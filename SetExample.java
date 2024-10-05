package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");

        System.out.println("Countries Set: " + countries);
    }
}

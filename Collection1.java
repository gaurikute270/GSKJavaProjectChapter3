import java.util.*;
import java.util.Iterator;
public class Collection1 {
public static void main(String args[]) {
java.util.ArrayList<String> al = new java.util.ArrayList<>();
al.add("ravi");
al.add("vijay");
al.add("ajay");
al.add("ram");
Iterator<String> itr = al.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
}
}
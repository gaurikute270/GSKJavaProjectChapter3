package Chapter2;
import java.util.LinkedList;
public class javacollections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> Name = new LinkedList<String>();
    Name.add("Ankit");
    Name.add("Ankush");
    Name.add("Altaf");
    System.out.println(Name);
    Name.addFirst("Rohit");
    Name.add("Amir");
    System.out.println(Name);
	}
}

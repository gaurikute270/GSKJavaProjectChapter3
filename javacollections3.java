package Chapter2;
import java.util.LinkedList;
public class javacollections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Name = new LinkedList<String>();
	    Name.add("Ankit");
	    Name.add("Ankush");
	    Name.add("Altaf");
	    System.out.println(Name);
	    Name.addFirst("Rohit");
	    Name.addLast("Amir");
	    System.out.println(Name);
	    Name.add(3,"Anish");
	    System.out.println(Name);
  }
}

package Chapter2;
import java.util.ArrayList;

public class javaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> Name = new ArrayList<String>();
  Name.add("Ankit");
  Name.add("Ankush");
  Name.add("Altaf");
  System.out.println(Name);
  Name.remove(1);
  System.out.println(Name);
  }
}

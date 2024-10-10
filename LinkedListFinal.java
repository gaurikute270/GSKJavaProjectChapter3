package Chapter2;

import java.util.LinkedList;

public class LinkedListFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Name = new LinkedList<String>();
	    Name.add("Gauri");
	    Name.add("Sanyog");
	    Name.add("Venkatesh");
	    System.out.println(Name);
	    Name.addFirst("Mayuri");
	    Name.add("Sudarshan");
	    Name.addLast("Rajashri");
	    System.out.println(Name);
	    Name.add(3,"Vaishnavi");
	    System.out.println(Name);
	    Name.remove();
	    System.out.println(Name);
	    Name.removeFirst();
	    Name.removeLast();
	    System.out.println(Name);
    }
}


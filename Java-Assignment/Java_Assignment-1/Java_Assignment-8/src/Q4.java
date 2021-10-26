import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> names = new ArrayList<>();
		names.add("Bhanus");
		names.add("Neelu");
		names.add("Bhavana");
		names.add("Mega");
		names.add("Sara");
		System.out.println("List before removing odd length elements \n");
		System.out.println(names);
		System.out.println();
		System.out.println("List after removing odd length elements\n");
		names.removeIf(name -> name.length()%2!=0);

		System.out.println(names);

	}

}

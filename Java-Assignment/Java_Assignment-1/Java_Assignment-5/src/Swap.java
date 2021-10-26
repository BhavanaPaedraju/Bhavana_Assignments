
import java.util.ArrayList;
import java.util.Collections;

public class Swap 
{
	public static void main(String[] args)
	{
		// Create the Array List
		
		ArrayList<String> ArrList = new ArrayList<String>();
		
		// Add the va;lues in Array List
		
		ArrList.add("Bhanu");
		ArrList.add("Bhavana");
		
		// display Array List before swap
		
		System.out.println("Before Swap the ArrayList ");
		System.out.println(ArrList);
		
		//Swapping the elements at 1 and 2 indices
		
		Collections.swap(ArrList, 0, 1);
		
		// display Array List after swap
		
		System.out.println("After Swap the ArrayList ");
		System.out.println(ArrList);
		
	}
	
}
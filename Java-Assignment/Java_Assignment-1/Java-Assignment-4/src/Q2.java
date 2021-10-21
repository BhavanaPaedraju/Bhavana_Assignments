import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List aList = new ArrayList();
	      aList.add('a');
	      aList.add('b');
	      try {
	    	  List newList = Collections.unmodifiableList(aList);
	          newList.add('c');
			}catch(ArithmeticException ae){
				System.out.println("Exception Occured");
				ae.printStackTrace();
			}finally {
				
			}

	}

}

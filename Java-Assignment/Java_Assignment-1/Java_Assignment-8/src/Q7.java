import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Hello", "Bhargav");
		map.put("Hii", "Aneela");
		
		for(Map.Entry m: map.entrySet())
		{
			/*String result = String.format(m.getKey() + "" +m.getValue());
			System.out.println(result);*/
			
			StringBuilder result = new StringBuilder(m.getKey() + "" +m.getValue());
			System.out.println(result);	
		}
		    
	}

}

import java.util.*;
class contact implements Comparable<contact>
{
	 long Phone;
	String name;
	String email;
	
	
	//constructor for contact
	public contact(String name,String email)
	{
		
		this.name = name;
		this.email = email;
		
	}
	//this will return the string
	public String toString()
	{
		return name +" "+email ;
	}

		//WE HAVE TO OVERIDE IT WHEN WE ARE IMPLEMENTING COMPARABLE INTERFACE 
	@Override
	public int compareTo(contact o) {
		
		return 0;
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		
//		contact c= new contact();
		//TREEMAP OBJECT....
		TreeMap<Long,contact> map=new TreeMap<>();
		//PUTTING KEY VALUE IN TREEMAP
		map.put(77545646l,new contact("seeta","seeta@"));
		map.put(756747l,new contact("ram","ram@"));
		map.put(8979399511l,new contact("bhanu","bhanu@"));
		map.put(67876867l,new contact("arjun","arjun@"));
		map.put(56757657l,new contact("sara","sara@"));
		
		for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey());    
		      }    
		
		for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getValue());    
		      }    
		
		Map<Long, contact> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
		reverseSortedMap.putAll(map);
		System.out.println("=========descending order ============");
		System.out.println(reverseSortedMap);
		 
	}

} 

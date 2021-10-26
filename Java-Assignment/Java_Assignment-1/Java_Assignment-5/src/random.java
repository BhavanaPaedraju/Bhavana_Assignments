import java.util.*;

public class random{  
 public static void main(String args[]){  
   HashMap<Integer,Double> map=new HashMap<Integer,Double>();//Creating HashMap    
   map.put(1,1.2345);  //Put elements in Map  
   map.put(2,4.6845);    
   map.put(3,9.23632);   
   map.put(4,16.423624);   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  
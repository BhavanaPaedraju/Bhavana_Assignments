import java.util.*;
public class Q8 extends Thread {
	
	public void run(){  
		List<Integer> ar1 = new ArrayList();
		ar1.add(12);
		ar1.add(23);
		ar1.add(413);
		ar1.add(4111);
		Iterator itr=ar1.iterator();
		  while(itr.hasNext()){ 
		   System.out.println(itr.next());  
		  }   
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q8 t1=new Q8();  
		t1.start(); 

	}

}

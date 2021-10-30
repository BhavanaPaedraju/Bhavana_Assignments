import java.util.*;

class product
{
	int id;
	public product(int id)
	{
		this.id= id;
	}
	//override hashcode method
	public int hashCode()
	{
		return id;
	}
	//logic for not getting same input again....
	//override equals method
	public boolean equals(Object o)
	{
		if(o instanceof product)
		{
			//downcasting the object 
			product i =(product)o;
			if(i.id==this.id)
			{
				return true;
			}return false;
		}
		return false;
		
	}
	//integer to String
	 public String toString()
	{
		return id +" ";
	}
}

public class Q2 {

	public static void main(String[] args) {
		HashSet<product> set =  new HashSet<>();
		product p1=new product(10001);
		product p2=new product(10002);
		product p3=new product(10003);
		product p4=new product(10003);
		product p5=new product(10003);
		product p6=new product(10004);
		product p7=new product(10005);
		product p8=new product(10006);
		product p9=new product(10007);
		product p10=new product(10007);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		set.add(p7);
		set.add(p8);
		set.add(p9);
		set.add(p10);
	
		Iterator<product> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
	}
}

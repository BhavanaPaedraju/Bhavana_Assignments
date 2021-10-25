import java.util.*;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Labour d1=new Labour(1,"Arpit" ,20000,10);
	        Labour d2=new Labour(2,"John" ,15000,23);
	        Manager m1=new Manager(1,"Amit" ,30000,2000);
	        Manager m2=new Manager(2,"Onkar" ,50000,5000);
	        
	        List<Labour> labourers=new ArrayList<>();
	        labourers.add(d1);
	        labourers.add(d2);
	        
	        List<Manager> managers=new ArrayList<>();
	        managers.add(m1);
	        managers.add(m2);
	        
	        
	        System.out.println("Name of Employee:" +d1.getEmployeeName()+"---"+"Salary:"+d1.getSalary());
	        System.out.println("Name of Employee:" +d2.getEmployeeName()+"---"+"Salary:"+d2.getSalary());
	        System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
	        System.out.println("Name of Employee:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
	       

}
}
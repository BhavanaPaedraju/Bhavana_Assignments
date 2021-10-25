abstract class Persistence
{
	abstract public void persist();
}
class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Data is saved in File");
		
	}
	
}

class DatabasePersistence extends Persistence
{
     public void persist() 
     {
    	 System.out.println("Data is saved in Database");
		
	}
	
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence obj1 = new FilePersistence();
		Persistence obj2 = new DatabasePersistence();
		obj1.persist();
		obj2.persist();

	}

}

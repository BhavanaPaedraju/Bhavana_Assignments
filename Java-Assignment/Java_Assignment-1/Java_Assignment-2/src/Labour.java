
public class Labour extends Employee{
	int OverTime;
	 
    public Labour(int employeeId, String employeeName, double salary,int OT) {
        super(employeeId, employeeName, salary);
        OverTime=OT;
    }
 
    public double getSalary() {
 
        return salary+(100+OverTime);
    }

}

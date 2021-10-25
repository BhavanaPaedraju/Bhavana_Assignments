
public class Manager extends Employee{
	double Incentive;
    public Manager(int employeeId, String employeeName, double salary, double Incen) {
        super(employeeId, employeeName, salary);
        Incentive=Incen;
    }
    public double getSalary() {
        return salary+Incentive;
    }

}

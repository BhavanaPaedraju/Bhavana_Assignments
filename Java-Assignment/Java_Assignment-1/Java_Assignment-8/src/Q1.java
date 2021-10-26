interface action {
	void perform(int num1,int num2);
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action fn = (num1,num2)->{System.out.println("Addition of two number is->  " +(num1+num2) +"\n"+"Substract is-> "+(num1-num2)+"\n"+
				"Multiplication is-> "+ (num1*num2)+"\n"+"Division is -> "+(num1/num2));};
		fn.perform(3,2);
	}

}

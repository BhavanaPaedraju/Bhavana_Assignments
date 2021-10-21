import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter b value");
		b=sc.nextInt();
		try {
			 c=a/b;
			 System.out.println(c);
		}catch(ArithmeticException ae){
			System.out.println("Exception Occured");
			ae.printStackTrace();
		}finally {
			sc.close();
		}

	}

}

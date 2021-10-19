import java.util.Scanner;  
import java.lang.Math;  
public class ArmstrongNumbers {
	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=n;   
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{      
	last = temp % 10;     
	sum +=  (Math.pow(last, digits));   
	temp = temp/10;   
	}  
	if(n==sum)    
	return true;       
	else return false;   
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the starting limit: ");  
		num1=sc.nextInt(); 
		System.out.print("Enter the Ending limit: ");
		num2=sc.nextInt();
		System.out.println("Armstrong Number from "+ num1 + "to "+num2+" are: ");  
		for(int i=0; i>=num1 && i<=num2; i++)  
		if(isArmstrong(i))  
		System.out.print(i+ ", ");  

	}

}

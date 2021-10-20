
public class SBQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("StringBuffer");
		StringBuffer sb2=new StringBuffer(" is a peer class of String");
		StringBuffer sb12=new StringBuffer(sb1.append(sb2));
		StringBuffer sb3=new StringBuffer(" that provide much of");
		StringBuffer sb123=new StringBuffer(sb12.append(sb3));
		StringBuffer sb4=new StringBuffer(" the functionality of Strings");
		StringBuffer result=new StringBuffer(sb123.append(sb4));
		
		System.out.println(result);
		

	}

}

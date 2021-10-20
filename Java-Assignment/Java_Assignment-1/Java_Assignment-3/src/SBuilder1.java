
public class SBuilder1 {
	public static void main(String Args[]) {
		StringBuilder sb1=new StringBuilder("StringBuilder");
		StringBuilder sb2=new StringBuilder(" is a peer class of String");
		StringBuilder sb12=new StringBuilder(sb1.append(sb2));
		StringBuilder sb3=new StringBuilder(" that provide much of");
		StringBuilder sb123=new StringBuilder(sb12.append(sb3));
		StringBuilder sb4=new StringBuilder(" the functionality of Strings");
		StringBuilder result=new StringBuilder(sb123.append(sb4));
		
		System.out.println(result);
		
	}

}

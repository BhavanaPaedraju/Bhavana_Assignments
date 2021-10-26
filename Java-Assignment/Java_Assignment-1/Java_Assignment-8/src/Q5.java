import java.util.*;
public class Q5 {

	String word;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List < String > wordList = Arrays.asList("Neelu","Bhanu","Shyam","Kishore");
		wordList.forEach((t) -> System.out.println(t));
		wordList.forEach((t) ->{
			StringBuilder sb=new StringBuilder();
			sb=sb.append(t.charAt(0));
			System.out.println(sb);
		});
		
	}

}


import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence: ");
		String sen = sc.nextLine().toLowerCase();
		
		
		System.out.println("Enter Charter: ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		
		int ind = sen.indexOf(ch)+1;
		
		
		if(ind>0) {
			System.out.println("Result: ");
			System.out.println(sen.substring(ind));
		}
		else {
			System.out.println("The letter does not exist in the Sentence");
		}
		
		
		

	}

}

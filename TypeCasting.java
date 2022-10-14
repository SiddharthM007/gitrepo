package practicepackage;
import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value : ");
		if(sc.hasNextInt())  {
			System.out.println("The integer value is : " + sc.next());	
		}
		else if (sc.hasNextDouble()) {
			System.out.println("The double value is : " + sc.next());
		}
		else if (sc.hasNext()) {
			System.out.println("The String value is : " + sc.next());
		}
		
	}

}
// code by Siddharth

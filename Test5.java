package mypackage;
import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Value");
		s = sc.nextInt();
		do {
			System.out.println(s);
			s++;
			
		} while (s<=5) ;
		
			
		}

	}


// The difference between these two codes that is for do while and while loop is that in do while loop even if the value exceeds
// the value of s it will show some answer and in while loop if it exceeds it will not show anything
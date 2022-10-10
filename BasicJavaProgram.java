package demo;
import java.util.*;
public class BasicJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		n = sc.nextInt();
		int var_factor = 1;
		
		for(int i = 1;i<=n;i++) {
		var_factor = var_factor * i;
		}
		System.out.println(var_factor);
				
		

	}

}

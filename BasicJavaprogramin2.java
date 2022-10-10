package demo;
import java.util.*;
public class BasicJavaprogramin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the value");
		n = sc.nextInt();
		
		int i = 1;
		while (i <=n) {
		fact *=i;
		i++;
		}
		
		System.out.println(fact);
		

	}

}

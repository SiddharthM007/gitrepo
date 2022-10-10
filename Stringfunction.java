package demo;

public class Stringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string_var1 = "string function program";
		String string_var2 = "string functions";
		
		// commonly used string function
		System.out.println("String Operatons are:");
		
		// getting character function
		System.out.println(string_var1.charAt(5));
		
		//getting unicode character at the specific index
		System.out.println(string_var1.codePointAt(5));
		
		//getting unicode character at the specific index
		System.out.println(string_var1.codePointBefore(5));
		
		//counting number of unicode character between the specific index
				System.out.println(string_var1.codePointCount(0,5));
		
		//compare two strings lexicographically ie based on unicode value
		System.out.println("\nstring comparison function");
		
		System.out.println(string_var1.compareTo(string_var2));
		
		//compare two strings lexicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		//appends a string with another 
		System.out.println("\nConcatenated string");
		System.out.println(string_var1.concat(string_var2));
		
		//checks whether strings contains another string
		System.out.println(string_var1.contains(string_var2));
		
		//checks whether strings end with specific character
				System.out.println(string_var1.endsWith("gram"));
		
				
		//compare and return true if strings are equal
		System.out.println(string_var1.equals(string_var2));
		
		//compare and return true if strings are equal by ignoring case
				System.out.println(string_var1.equalsIgnoreCase(string_var2));
				
		//hash code for strings is computed like this
				//s(0)*31^(n-1) = s[1]*31^(n-2)+....s(n-1)
				System.out.println(string_var1.hashCode());
				
		
		// gets the position of first occurance of specific character
				System.out.println(string_var1.indexOf("program"));
				
		// verifies if strings are equal
				String string_var3 = "Demo";
				System.out.println(string_var3.isEmpty());
				
		// gets position of last occurrence of specific character
				string_var3 = "functions program functions";
				System.out.println("\nlast occurrance position");
				System.out.println(string_var3.lastIndexOf("functions"));
				
				
	    // verifies if string starts with given string
				System.out.println(string_var1.startsWith("string"));
				
		// gets string length
				System.out.println(string_var1.length());
				
		// search string with specific value and replace with it
				System.out.println(string_var3.replace("functions", "java"));
				System.out.println(string_var3);
				
		// converts string to lower case
				string_var1 = "HELLO WORLD";
				System.out.println(string_var1.toLowerCase());
				
		// converts string to upper case
				System.out.println(string_var1.toUpperCase());
				
		// Trims space before and after the string
				String string_var4 = "      Hello World   ";
				System.out.println(string_var4.trim());

	}

}

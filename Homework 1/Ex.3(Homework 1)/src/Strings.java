
public class Strings {

	public static void main(String[] args) {
		String name = "Java Developer";
		int len = name.length();
		char first = name.charAt(0);
		char last = name.charAt(len-1);
		char middle = name.charAt(len/2);
		int sum = (int) first + (int) middle + (int) last;
		
		
		System.out.println("My string is: " + name);
		System.out.println("Its first character is: " + first);
		System.out.println("Its last character is: " + last);
		System.out.println("Its middle character is: " + middle);
		System.out.println("The sum of these characters is " + sum);
		
		
        if((int) first > (int) middle && (int) first > (int) last) {
        	System.out.println("The biggest character of the three is: " + first + " with the code of " + (int) first);
		} else if ((int) middle > (int) first && (int) middle > (int) last) {
			System.out.println("The biggest character of the three is: " + middle + " with the code of " + (int) middle);
		} else {
			System.out.println("The biggest character of the three is: " + last + " with the code of " + (int) last);
		}
	}

}

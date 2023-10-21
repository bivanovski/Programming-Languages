
public class Number {

	public static void main(String[] args) {

		float random = (float) (Math.random() * 100);
		int integer = (int) random;
		float decimal = random - integer;
		char letter = (char) integer;
		System.out.println("From 0..100, the computer picked: " + random);
		System.out.println("Integer part of the number is:" + integer);
		System.out.println("Decimal part of the number is:" + decimal);
		System.out.println("Character with code: " + integer + " is: " + letter);

	}

}

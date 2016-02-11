package Core;

public class Reverse_StringBuilder {

	public static void main(String[] args) {
		String string = "Reverse String";
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = string.toCharArray();
		for (int i = strChars.length -1; i >= 0; i--) {
		strBuilder.append(strChars[i]); }
		String reverse = strBuilder.toString();
		System.out.println("Reverse String = " + reverse);
		}
	}


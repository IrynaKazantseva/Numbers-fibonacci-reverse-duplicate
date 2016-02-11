package Core;

public class Reverse_StringRecursively {
public static void main(String[] args) {
	String string = "Reverse String";
	System.out.println(reverse(string));
}
	public static String reverse(String str) {
		if (str.length() < 2) {
			return str; }
		String reversed = reverse(str.substring(1)) + str.charAt(0);
			return reversed;
		}
	}


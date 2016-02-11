package Core;

public class Reverse_StringBuffer {
public static void main(String[] args) {
	String string = "Reverse String";
	String reverse = new StringBuffer(string).reverse().toString();
	System.out.println("Reverse String = " + reverse);
}
}

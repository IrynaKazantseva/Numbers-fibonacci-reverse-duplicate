package Core;

public class Fing_LongestString {
public static void main(String[] args) {
	String input = "Cheese Pepperoni Olives Pizza";
	String[] a = input.split(" ");
	int maxLength = 0;
	String LongestString = null;
	for (String s : a) {
		if (s.length() > maxLength) {
			maxLength = s.length();
			LongestString = s;}}
			System.out.println("Longest String: " + LongestString);
		}
	}


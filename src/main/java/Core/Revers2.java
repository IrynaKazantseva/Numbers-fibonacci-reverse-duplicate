package Core;

public class Revers2 {
 public static void main(String[] args) {
	 int number = 12345;
	 String num = String.valueOf(number);
	 String result = "";
	 for (int i = num.length() - 1; i>=0; i--) {
		 result = result + num.charAt(i);
		 int reverse = Integer.parseInt(result);
		 System.out.println("Revers: " + reverse);
	 }
 }
}

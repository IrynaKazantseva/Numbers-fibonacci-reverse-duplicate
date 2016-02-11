package Core;

public class Fibonacci {


public static void main(String[] args) {
int max = 93;
long fibonacci = 0;
long fibonacci2 = 1;
System.out.println(1+ ": " + fibonacci);
for (int i = 2; i <= max; i++) {
fibonacci = fibonacci + fibonacci2;
fibonacci2 = fibonacci - fibonacci2;
System.out.println(i + ": " + fibonacci);
}
}
}
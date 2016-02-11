package Core;

import java.util.Arrays;

public class FindDupicate {
public static void main(String a[]) {
	int[] numbers = {50,55,21,55,21,63,64,85,44,55,585,54};
	Arrays.sort(numbers);
	for (int i = 1; i < numbers.length; i++) {
		if (numbers[i] == numbers [i-1]) {
			System.out.println("Duplicate: " + numbers[i]);
		}
	}
}
}

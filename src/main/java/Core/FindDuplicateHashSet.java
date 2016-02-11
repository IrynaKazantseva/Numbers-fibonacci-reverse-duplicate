package Core;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateHashSet {
public static void main(String a[]) {
	int[] numbers = {50,55,21,55,21,63,64,85,44,55,585,54};
	Set<Integer> set = new HashSet<Integer>();
	for (int n : numbers) {
		boolean unique = set.add(n);
		if (!unique)                                            //(!unique == false)
			System.out.println("Duplicate: " + n);
	}
}
}

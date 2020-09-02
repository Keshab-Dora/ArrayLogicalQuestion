import java.io.FileNotFoundException;

/**
 * 
 * 
 * @author Keshab Dora
 *
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		int x = 120;
		long sum = 0;
		while (x != 0) {
			sum = sum * 10 + x % 10;
			x = x / 10;
		}
		if (Integer.MAX_VALUE < sum || Integer.MIN_VALUE > sum)
			System.out.println(0);
		System.out.println((int) sum);
	}

}

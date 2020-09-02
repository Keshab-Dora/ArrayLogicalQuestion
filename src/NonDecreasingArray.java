
public class NonDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 4, 2, 3 };
		System.out.println(checkPossibility(nums));
	}

	public static boolean checkPossibility(int[] nums) {

		int counter = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				counter++;
				if (counter > 1)
					return false;
				if (i > 0) {
					if (nums[i - 1] <= nums[i + 1])
						nums[i] = nums[i - 1];
					else
						nums[i + 1] = nums[i];

				}
			}

		}
		return true;
	}
}

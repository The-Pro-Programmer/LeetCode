package arrays.easy;

public class RunningSumOf1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] runningSum(int[] nums) {
		int prev = nums[0];
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			nums[i] += prev;
			prev = nums[i];
		}
		return nums;
	}

}

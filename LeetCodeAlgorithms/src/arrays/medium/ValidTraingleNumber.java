package arrays.medium;

import java.util.Arrays;

public class ValidTraingleNumber {

	public static void main(String[] args) {
		ValidTraingleNumber obj = new ValidTraingleNumber();
		System.out.println(obj.triangleNumber(new int[] {}));
		System.out.println(obj.triangleNumber(new int[] { 4, 6, 3, 7 }));
		System.out.println(obj.triangleNumber(new int[] { 10, 21, 22, 100, 101, 200, 300 }));

	}

	public int triangleNumber(int[] nums) {
		if (nums == null || nums.length < 3) {
			return 0;
		}
		int n = nums.length;
		Arrays.sort(nums);

		int count = 0;

		for (int i = n - 1; i >= 1; i--) {
			int l = 0, r = i - 1;
			while (l < r) {
				if (nums[l] + nums[r] > nums[i]) {
					count += r - l;
					r--;
				} else {
					l++;
				}
			}
		}
		return count;
	}

}

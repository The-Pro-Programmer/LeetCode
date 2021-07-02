package arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		Set<Integer> visited = new HashSet<>();
		int n = nums.length;
		int[] result = new int[2];
		for (int i = 0; i < n - 1; i++) {
			if (!visited.contains(nums[i]))
				visited.add(nums[i]);
				for (int j = i + 1; j < n; j++) {
					if (nums[i] + nums[j] == target) {
						result[0] = i;
						result[1] = j;
						break;
					}
				}
		}
		return result;
	}

}

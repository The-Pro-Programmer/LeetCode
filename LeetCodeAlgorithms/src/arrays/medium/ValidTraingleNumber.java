package arrays.medium;

import java.util.LinkedList;
import java.util.List;

public class ValidTraingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int triangleNumber(int[] nums) {
		if(nums==null || nums.length<3) {
			return 0;
		}
		if(nums.length==3) {
			int sum = nums[0] + nums[1];
			if(sum>nums[2]) {
				return 1;
			}
			return 0;
		}
		List<List<Integer>> triangles = new LinkedList();
		int n = nums.length;
		for(int i=0; i<n-2; i++) {
			
		}
		return triangles.size();
	}

}

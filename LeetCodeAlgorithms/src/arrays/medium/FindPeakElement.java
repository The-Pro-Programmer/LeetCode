package arrays.medium;

public class FindPeakElement {

	public static void main(String[] args) {
	
		FindPeakElement obj = new FindPeakElement();
		System.out.println(obj.findPeakElement(new int[] {1,2,3,1}));
		System.out.println(obj.findPeakElement(new int[] {1,2,1,3,5,6,4}));
		System.out.println(obj.findPeakElement(new int[] {1,2}));
		System.out.println(obj.findPeakElement(new int[] {2,1}));
	}

	public int findPeakElement(int[] nums) {

		if(nums==null || nums.length==0) {
			return 0;
		}
		
		int n = nums.length; 
		if(n==2) {
			if(nums[0]>nums[1]) {
				return 0;
			}else {
				return 1;
			}
		}
		int largestNum = nums[0];
		int largestNumIndex = 0;
		for(int i=1; i<n-1; i++) {
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
				return i;
			}
			if(nums[i]>largestNum) {
				largestNum = nums[i];
				largestNumIndex = i;
			}
		}
		
		if(nums[n-1]>largestNum) {
			largestNum = nums[n-1];
			largestNumIndex = n-1;
		}
		
		return largestNumIndex;
		
	}

}

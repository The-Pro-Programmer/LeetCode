package arrays.hard;


public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1, 3}, new int[] {2}));
		System.out.println(findMedianSortedArrays(new int[] {1, 3}, new int[] {2, 4}));
		System.out.println(findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}));
		System.out.println(findMedianSortedArrays(new int[] {}, new int[] {1}));
	}

	public static double findMedianSortedArrays(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int anext = 0, bnext=0, count = 0;
		double median = 0d;
		boolean aComplete = false, bComplete = false;
		
		if((n+m)%2==0) {
			int max = ((n+m)/2)+1; //Median is (max + (max+1))'th element
			double median2 = 0;
			while(count<max) {
				//Checking if iterations over arrays is completed
				if(anext>n-1) {
					aComplete = true;
				}
				if(bnext>m-1) {
					bComplete = true;
				}
				
				if(aComplete) {
					median2 = median;
					median = (double)b[bnext];
					bnext++;
				}else if(bComplete) {
					median2 = median;
					median = (double)a[anext];
					anext++;
				}
				else if(a[anext]<b[bnext]) {
					median2 = median;
					median = (double)a[anext];
					anext++;
				}else {
					median2 = median;
					median = (double)b[bnext];
					bnext++;
				}
				count++;
			}
			median = (median + median2)/2.0;
		}else {
			int max = (n+m+1)/2; //Median is max'th element
			
			while(count<max) {
				//Checking if iterations over arrays is completed
				if(anext>n-1) {
					aComplete = true;
				}
				if(bnext>m-1) {
					bComplete = true;
				}
				
				if(aComplete) {
					median = (double)b[bnext];
					bnext++;
				}else if(bComplete) {
					median = (double)a[anext];
					anext++;
				}
				else if(a[anext]<b[bnext]) {
					median = (double)a[anext];
					anext++;
				}else {
					median = (double)b[bnext];
					bnext++;
				}
				count++;
			}
		}
		return median;
	}


}

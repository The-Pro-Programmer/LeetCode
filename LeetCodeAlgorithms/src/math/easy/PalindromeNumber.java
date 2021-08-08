package math.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(int x) {
		int rev = reverse(x);
		return x==rev;
	}

	public int reverse(int num) {

		num = Math.abs(num);
		Long ret = 0l;
		while (num > 0) {
			ret = (ret * 10) + (num % 10);
			num = num / 10;
		}
		return ret.intValue();

	}

}

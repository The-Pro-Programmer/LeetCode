package strings.hard;

public class ShortestPalindrome {

	public static void main(String[] args) {
		ShortestPalindrome obj = new ShortestPalindrome();
		System.out.println(obj.shortestPalindrome("acbca"));
		System.out.println(obj.shortestPalindrome("abba"));
		System.out.println(obj.shortestPalindrome("ab"));
		System.out.println(obj.shortestPalindrome("abcd"));
		System.out.println(obj.shortestPalindrome("aacecaaa"));
		System.out.println(obj.shortestPalindrome("aabba"));
	}

	
	public String shortestPalindrome(String s) {
		if(isPalindrome(s)) {
			return s;
		}
		int first = 0;
		while(first<=(s.length()-1)) {
			char cleft = s.charAt(first), cright = s.charAt(s.length()-first-1);
			if(cleft == cright) {
				first++;
			}else {
				String left = s.substring(0, first);
				String right = s.substring(first, s.length());
				s = left + cright + right;
				first++;
			}
			if(isPalindrome(s)) {
				break;
			}
		}
		return s;
	}
	
	private boolean isPalindrome(String str) {
		if(str.equals("")) {
			return true;
		}
		int n = str.length();
		int m = n/2;
		String left = str.substring(0, m);
		String right = str.substring(n%2==0 ? m : m+1);
		StringBuilder bldr = new StringBuilder(right);
		right = bldr.reverse().toString();
		return left.equals(right);
	}

}

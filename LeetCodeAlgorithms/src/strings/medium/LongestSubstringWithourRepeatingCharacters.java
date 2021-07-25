package strings.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithourRepeatingCharacters {

	public static void main(String[] args) {
		
		LongestSubstringWithourRepeatingCharacters obj = new LongestSubstringWithourRepeatingCharacters();
		System.out.println(obj.lengthOfLongestSubstring("dvdf"));
		System.out.println(obj.lengthOfLongestSubstring(""));
		System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
		System.out.println(obj.lengthOfLongestSubstring("bbbbbb"));
		System.out.println(obj.lengthOfLongestSubstring(" "));
		System.out.println(obj.lengthOfLongestSubstring("    "));
	}

	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		Set<String> charSet = new HashSet<>();
		int n = s.length();
		int maxLen = Integer.MIN_VALUE;
		int start = 0;
		for (int i = 0; i < n; i++) {
			String sub = "" + s.charAt(i);
			if (charSet.contains(sub)) {
				maxLen = Integer.max(maxLen, charSet.size());
				i = start;
				start++;
				charSet = new HashSet<>();
			}else {
				charSet.add(sub);
			}
		}

		return Integer.max(maxLen, charSet.size());

	}

}

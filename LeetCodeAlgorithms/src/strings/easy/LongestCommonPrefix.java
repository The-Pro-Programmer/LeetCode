package strings.easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		System.out.println(obj.longestCommonPrefix(new String[] {"flower","flow","flight"}));
		System.out.println(obj.longestCommonPrefix(new String[] {"flower","flow","floyd"}));
		System.out.println(obj.longestCommonPrefix(new String[] {"flower","flow",""}));
		System.out.println(obj.longestCommonPrefix(new String[] {"dog","racecar","car"}));
	}

	public String longestCommonPrefix(String[] strs) {
		String shortestString = "";
		if(strs!=null && strs.length>0) {
			int n = strs.length;
			shortestString = Arrays.stream(strs)
					.sorted(Comparator.comparingInt(String::length))
					.findFirst()
					.orElse("");
			for(int i=0; i<n; i++) {
				String str = strs[i];
				if(!shortestString.equals(str)) {
					int commonIndex = 0;
					for(int j=0; j<shortestString.length(); j++) {
						if(str.charAt(j)!=shortestString.charAt(j)) {
							break;
						}else {
							commonIndex++;
						}
					}
					shortestString = shortestString.substring(0, commonIndex);
				}
			}
		}
		return shortestString;
	}

}

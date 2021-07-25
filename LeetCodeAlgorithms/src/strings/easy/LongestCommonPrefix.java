package strings.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {

	}

	public String longestCommonPrefix(String[] strs) {
		StringBuilder common = new StringBuilder();
		if(strs!=null && strs.length>0) {
			int n = strs.length;
			int index = 0;
			while(true) {
				char ch = strs[0].charAt(index);
				for(int i=1; i<n; i++) {
					if(strs[i].length()>=index) {
						if(ch!=strs[i].charAt(index)) {
							break;
						}
					}
				}
				common.append(""+ch);
				index++;
			}
			
		}
		return common.toString();
	}

}

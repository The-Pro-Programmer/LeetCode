package strings.hard;

import java.util.Stack;

public class LongestValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestValidParenthesis obj = new LongestValidParenthesis();
		System.out.println(obj.longestValidParentheses("(()"));
		System.out.println(obj.longestValidParentheses(")()())"));
		System.out.println(obj.longestValidParentheses(""));
		System.out.println(obj.longestValidParentheses("))(("));
		System.out.println(obj.longestValidParentheses("()(()"));
		System.out.println(obj.longestValidParentheses("()(())"));
	}

	public int longestValidParentheses(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else ans = Math.max(ans, i - stack.peek());
            }
        return ans;
	}

}

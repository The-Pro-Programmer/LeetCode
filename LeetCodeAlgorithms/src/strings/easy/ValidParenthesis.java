package strings.easy;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		ValidParenthesis obj = new ValidParenthesis();
		System.out.println(obj.isValid("()"));
		System.out.println(obj.isValid("([])"));
		System.out.println(obj.isValid("([{}])"));
		System.out.println(obj.isValid("([)"));
		System.out.println(obj.isValid("([]){}"));
		System.out.println(obj.isValid("([])}"));
		System.out.println(obj.isValid("(("));
	}

	public boolean isValid(String s) {

		if(s==null || s.length()<2) {
			return false;
		}
		
		Stack<Character> stack = new Stack<>();
		int n = s.length();
		for(int i=0; i<n; i++) {
			Character ch = s.charAt(i);
			if((ch==']' || ch==')' || ch=='}') && stack.isEmpty()) {
				return false;
			}
			if(ch=='[' || ch=='(' || ch=='{') {
				stack.push(ch);
			}else {
				if(ch==']') {
					if(stack.pop()!='[') {
						return false;
					}
				}else if(ch=='}') {
					if(stack.pop()!='{') {
						return false;
					}
				}else if(ch==')') {
					if(stack.pop()!='(') {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
	}

}

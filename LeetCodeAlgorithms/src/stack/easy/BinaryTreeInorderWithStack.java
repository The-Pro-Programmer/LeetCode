package stack.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderWithStack {

	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> traversal = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		while(current!=null || stack.size()>0) {
			while(current!=null) {
				stack.push(current);
				current = current.left;
			}
			if(!stack.isEmpty()) {
				current = stack.pop();
				traversal.add(current.val);
			}
			current = current.right;
		}
		return traversal;
	}

}

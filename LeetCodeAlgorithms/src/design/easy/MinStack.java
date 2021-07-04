package design.easy;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {

		String operations[] = {"MinStack","push","push","push","getMin","pop","top","getMin"};
		int vals[][] = {{},{-2},{0},{-3},{},{},{},{}};

		int n = operations.length;
		MinStack obj = null;
		for(int i=0; i<n; i++) {
			switch(operations[i]) {
				case "MinStack":	obj = new MinStack();
									obj.print();
									break;
				case "push":		obj.push(vals[i][0]);
									obj.print();
									break;
				case "getMin":		System.out.println("Min: " + obj.getMin());
									obj.print();
									break;
				case "pop":			obj.pop();
									obj.print();
									break;
				case "top":			System.out.println("Top: " + obj.top());
									obj.print();
									break;
			}
		}
		
	}

	/** initialize your data structure here. */
	Stack<Integer> stack = null;
	int currentIndex = -1;
	boolean refresh = true;
	int min = 0;

	public MinStack() {
		stack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		currentIndex++;
		refresh = true;
	}

	public void pop() {
		stack.pop();
		currentIndex--;
		refresh = true;
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		if(refresh) {
			min = stack.stream().min(Integer::compare).get();
			refresh = false;
		}
		return min;
	}
	
	public void print() {
		//System.out.println();
		//Arrays.stream(stack).forEach(num -> System.out.print(num + " "));
		//System.out.println();
	}

}

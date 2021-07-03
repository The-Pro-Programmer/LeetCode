package design.easy;

import java.util.Arrays;

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
	int stackSize = 5;
	int[] stack = null;
	int currentIndex = -1;

	public MinStack() {
		stack = new int[stackSize];
	}

	public void push(int val) {
		if (currentIndex < stackSize-1) {
			currentIndex++;
			stack[currentIndex] = val;
		} else {
			int newStackSize = stackSize + (stackSize / 2);
			int backup[] = stack;
			stack = new int[newStackSize];
			int i = 0;
			for (; i < stackSize; i++) {
				stack[i] = backup[i];
			}
			stack[i] = val;
			stackSize = newStackSize;
			currentIndex = i;
		}
	}

	public void pop() {
		currentIndex--;
	}

	public int top() {
		return stack[currentIndex];
	}

	public int getMin() {
		int[] temp = Arrays.copyOfRange(stack, 0, currentIndex+1); 
		return Arrays.stream(temp).min().getAsInt();
	}
	
	public void print() {
		//System.out.println();
		//Arrays.stream(stack).forEach(num -> System.out.print(num + " "));
		//System.out.println();
	}

}

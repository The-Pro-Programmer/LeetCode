package strings.medium;

import java.util.LinkedList;
import java.util.List;

public class IntegerToRoman {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		IntegerToRoman itr = new IntegerToRoman();
		for (int num : nums) {
			System.out.println(num + " -- " + itr.intToRoman(num));
		}
	}

	public String intToRoman(int num) {
		String result = "";
		
		List<Pair> pairs = new LinkedList<>();
		pairs.add(new Pair(1000, "M"));
		pairs.add(new Pair(900, "CM"));
		pairs.add(new Pair(500, "D"));
		pairs.add(new Pair(400, "CD"));
		pairs.add(new Pair(100, "C"));
		pairs.add(new Pair(90, "XC"));
		pairs.add(new Pair(50, "L"));
		pairs.add(new Pair(40, "XL"));
		pairs.add(new Pair(10, "X"));
		pairs.add(new Pair(9, "IX"));
		pairs.add(new Pair(5, "V"));
		pairs.add(new Pair(4, "IV"));
		pairs.add(new Pair(1, "I"));
		
		for(Pair pair : pairs) {
			while(num>=pair.base) {
				num -= pair.base;
				result += pair.chr;
			}
		}
		
		
		return result;
	}
	
	class Pair{
		int base;
		String chr;
		Pair(int base, String chr){
			this.base = base;
			this.chr = chr;
		}
	}

}

package math.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(123));
		System.out.println(obj.reverse(1123));
		System.out.println(obj.reverse(-123));
		System.out.println(obj.reverse(-1));
		System.out.println(obj.reverse(1534236469));
	}

	public int reverse(int num) {
		
		Boolean isNegative = (num < 0);
		num = Math.abs(num);
		Long ret = 0l;
		while(num>0) {
			ret = (ret*10) + (num%10);
			num = num/10;
		}
		if(ret>Integer.MAX_VALUE) {
			return 0;
		}
		return isNegative ? -ret.intValue() : ret.intValue();

	}

}

package leetCode30days;

public class NumberComplement {

	public static void main(String[] args) {

		findComplement(5);
	}

	public static int findComplement(int num) {

		int pos = 0, result = 0;

		if (num == 0) {
			return 1;
		}
		while (num != 0) {
			int binaryDigit = num % 2;
			binaryDigit = binaryDigit == 0 ? 1 : 0;// flip digit
			num /= 2;
			result += (int) Math.pow(2, pos) * binaryDigit;
			pos++;
		}
		return result;
		
		// converting to binary and representing it in a string
		/*
		 * String bin = Integer.toBinaryString(num); char last = bin.charAt(bin.length()
		 * -1); if (last == '0') String newbin = bin. System.out.println(bin); return
		 * num;
		 */
	}

}

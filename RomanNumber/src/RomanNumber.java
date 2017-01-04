
public class RomanNumber {

//	private static final int _1 = 1;
//	private static final String I = "I";
//	private static final String V = "V";
//	private static final int _5 = 5;
//	private static final String X = "X";
//	private static final int _10 = 10;

	public static String convert(int arabic) throws Exception {
		return convert2(arabic);
		
//		String roman = "";
//		if (arabic <= 13) {
//			roman = handle2(I, V, X, _1, _5, _10, arabic, roman);
//		} else {
//			roman = X+I+V;
//		}
//		return roman;
	}

	private static int[] nums = {10, 9, 5, 4, 1};
	private static String[] romans = {"X", "IX", "V", "IV", "I"};
	
	public static String convert2(int arabic) throws Exception {
		String roman = "";
		
		if (arabic == 0) throw new RuntimeException();
		
		for (int i=0; i<nums.length; i++) {
			while (arabic >= nums[i]) {
				roman += romans[i];
				arabic -= nums[i];
			}
		}
		return roman;
	}

//	private static String handle2(	String roman_low, String roman_mid, String roman_high, 
//									int arabic_low, int arabic_mid, int arabic_high,
//									int arabic, String roman) {
//		if (arabic <= (arabic_high - arabic_mid + (arabic_low * 3))) {
//			roman = handle(roman_low, roman_mid, arabic_low, arabic_mid, arabic, roman);
//		} else {
//			roman = handle(roman_low, roman_high, arabic_low, arabic_high, arabic, roman);
//		}
//		return roman;
//	}
//
//	private static String handle(	String roman_low, String roman_high, 
//									int arabic_low, int arabic_high, 
//									int arabic, String roman) {
//		if (arabic == (arabic_high-arabic_low)) {
//			roman = roman_low + roman_high;
//		} else if (arabic >= arabic_high) {
//			roman = roman_high;
//			roman = add(roman_low, arabic-arabic_high, roman);
//		} else {
//			roman = add(roman_low, arabic, roman);
//		}
//		return roman;
//	}
//
//	private static String add(String symbol, int num, String roman) {
//		for (int i=0; i<num; i++) {
//			roman += symbol;
//		}
//		return roman;
//	}
}

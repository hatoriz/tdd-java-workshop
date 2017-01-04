
public class FizzBuzz {
	public String say(int i) {
		Rule[] rules = { 	new FizzBuzzRule(),
							new FizzRule(),
							new BuzzRule(),
							new WowRule()
						}; 
		
		for (Rule r : rules) {
			if (r.isValid(i)) {
				return r.say(i);
			}
		}
		return new DefaultRule().say(i);
	}
	
//	public String say(int i) {
//		String s = "";
//		if (isFizzNumber(i)) {
//			s += "Fizz";
//		}
//		if (isBuzzNumber(i)) {
//			s +=  "Buzz";
//		}
//		if (s == "") {
//			s = String.valueOf(i);
//		}
//		return s;
//	}
//
//	private boolean isBuzzNumber(int i) {
//		return i % 5 == 0;
//	}
//
//	private boolean isFizzNumber(int i) {
//		return i % 3 == 0;
//	}
}

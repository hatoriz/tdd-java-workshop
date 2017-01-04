
public class BuzzRule implements Rule {
	@Override
	public boolean isValid(int i) {
		return (i % 5 == 0);
	}
	
	@Override
	public String say(int i) {
		return "Buzz";
	}
}

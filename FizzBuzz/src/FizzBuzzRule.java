
public class FizzBuzzRule implements Rule {
	@Override
	public boolean isValid(int i) {
		return (i % 15 == 0);
	}
	
	@Override
	public String say(int i) {
		return "FizzBuzz";
	}
}

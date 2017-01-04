
public class FizzRule implements Rule {
	@Override
	public boolean isValid(int i) {
		return (i % 3 == 0);
	}
	
	@Override
	public String say(int i) {
		return "Fizz";
	}
}

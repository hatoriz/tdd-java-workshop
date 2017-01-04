
public class DefaultRule implements Rule {
	@Override
	public boolean isValid(int i) {
		return true;
	}
	
	@Override
	public String say(int i) {
		return String.valueOf(i);
	}
}

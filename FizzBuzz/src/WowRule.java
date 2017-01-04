public class WowRule implements Rule {
	@Override
	public boolean isValid(int i) {
		return (i % 7 == 0);
	}

	@Override
	public String say(int i) {
		return "Wow";
	}

}

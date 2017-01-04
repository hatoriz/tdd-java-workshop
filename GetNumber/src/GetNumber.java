import java.util.Random;

public class GetNumber {
	private Random random;

	public GetNumber () {}
	
//	public GetNumber(Random r) {}	// Constructor injection
	
	public void setRandom(Random r) {	// Property injection (Spring)
		this.random = r;
	}
	
	public int random() {
		if (this.random.nextInt(11) == 10) {
			return 10;
		} throw new HahaException();
	}
	
//	public int random() {
//		return this.random.nextInt(11);
//	}
	
//	public int random(Random r) {	// Method injection
//		return r.nextInt(11);
//	}

//	Test unstable inconsistency
//	public int random() {
//		return new Random().nextInt(11);
//	}
}

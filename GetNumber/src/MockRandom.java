import java.util.Random;

public class MockRandom extends Random {	// Mock & Spy Class
	private int counter;
	
	
	@Override
	public int nextInt(int bound) {	// Mock method
		counter++;
		return super.nextInt(bound);
	}
	
	public int getCounter() {	// Spy method
		return counter;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GetNumberTest {
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void should_get_10() {
		GetNumber g = new GetNumber();
		g.setRandom(new Random10());
		int actualNumber = g.random();
		assertEquals(10, actualNumber);
	}
	
	@Test(expected=HahaException.class)
	public void should_get_1() {
		GetNumber g = new GetNumber();
		g.setRandom(new Random1());
		g.random();
	}
	
	@Test(expected=HahaException.class)
	public void should_be_called() {
		GetNumber g = new GetNumber();
		MockRandom m = new MockRandom();
		g.setRandom(m);
		g.random();
		g.random();
		assertTrue(m.getCounter() == 1);
	}

}

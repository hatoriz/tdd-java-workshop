import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {
	@Test
	public void should_get_I_when_1() throws Exception {
		assertEquals("I", RomanNumber.convert(1));
	}

	@Test
	public void should_get_II_when_2() throws Exception {
		assertEquals("II", RomanNumber.convert(2));
	}
	
	@Test
	public void should_get_III_when_3() throws Exception {
		assertEquals("III", RomanNumber.convert(3));
	}
	
	@Test
	public void should_get_IV_when_4() throws Exception {
		assertEquals("IV", RomanNumber.convert(4));
	}
	
	@Test
	public void should_get_V_when_5() throws Exception {
		assertEquals("V", RomanNumber.convert(5));
	}
	
	@Test
	public void should_get_VI_when_6() throws Exception {
		assertEquals("VI", RomanNumber.convert(6));
	}
	
	@Test
	public void should_get_VII_when_7() throws Exception {
		assertEquals("VII", RomanNumber.convert(7));
	}
	
	@Test
	public void should_get_XI_when_9() throws Exception {
		assertEquals("IX", RomanNumber.convert(9));
	}
	
	@Test
	public void should_get_X_when_10() throws Exception {
		assertEquals("X", RomanNumber.convert(10));
	}
	
	@Test
	public void should_get_XI_when_11() throws Exception {
		assertEquals("XI", RomanNumber.convert(11));
	}
	
	@Test
	public void should_get_XIII_when_13() throws Exception {
		assertEquals("XIII", RomanNumber.convert(13));
	}
	
	@Test
	public void should_get_XIII_when_14() throws Exception {
		assertEquals("XIV", RomanNumber.convert(14));
	}
	
	@Test
	public void should_get_XIII_when_15() throws Exception {
		assertEquals("XV", RomanNumber.convert(15));
	}
	
	@Test(expected = RuntimeException.class)
	public void should_get_exception_when_0() throws Exception {
		RomanNumber.convert(0);
	}
}

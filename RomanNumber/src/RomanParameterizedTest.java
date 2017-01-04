import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RomanParameterizedTest {
	private int arabic;
	private String roman;
	
	public RomanParameterizedTest(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1, "I"},
			{2, "II"},
			{4, "IV"}
		});
	}
	
	@Test
	public void roman_parameterized() throws Exception {
		assertEquals(roman, RomanNumber.convert(arabic));
	}
}

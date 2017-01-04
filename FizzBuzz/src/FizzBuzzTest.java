import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	public void should_say_1_when_number_is_1() {
		assertEquals("1", fb.say(1));
	}
	
	@Test
	public void should_say_2_when_number_is_2() {
		assertEquals("2", fb.say(2));
	}
	
	@Test
	public void should_say_fizz_when_number_is_3() {
		assertEquals("Fizz", fb.say(3));
	}
	
	@Test
	public void should_say_buzz_when_number_is_5() {
		assertEquals("Buzz", fb.say(5));
	}
	
	@Test
	public void should_say_fizz_when_number_is_divided_by_3_but_not_5() {
		assertEquals("Fizz", fb.say(3));
		assertEquals("Fizz", fb.say(6));
		assertEquals("Fizz", fb.say(9));
	}
	
	@Test
	public void should_say_buzz_when_number_is_divided_by_5_but_not_3() {
		assertEquals("Buzz", fb.say(5));
		assertEquals("Buzz", fb.say(10));
		assertEquals("Buzz", fb.say(20));
	}
	
	@Test
	public void should_say_fizzbuzz_when_number_is_15() {
		assertEquals("FizzBuzz", fb.say(15));
	}
	
	@Test
	public void should_say_fizzbuzz_when_number_is_divided_by_3_and_5() {
		assertEquals("FizzBuzz", fb.say(15));
		assertEquals("FizzBuzz", fb.say(30));
		assertEquals("FizzBuzz", fb.say(45));
	}
	
	@Test
	public void should_say_wow_when_number_is_7() {
		assertEquals("Wow", fb.say(7));
	}
}

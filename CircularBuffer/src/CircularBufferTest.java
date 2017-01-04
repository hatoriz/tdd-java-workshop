import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import junit.framework.TestCase;

public class CircularBufferTest {
	CircularBuffer c = new CircularBuffer();

	@Test
	public void size_should_be_5_after_set_size_5() {	
		c.setSize(5);
		int actualSize = c.getSize();
		assertEquals(5, actualSize);
	}
	
	@Test
	public void size_should_be_6_after_set_size_6() {
		c.setSize(6);
		int actualSize = c.getSize();
		assertEquals(6, actualSize);
	}
	
	@Test
	public void add_a_should_remove_a() {
		c.add('a');
		char actualData = c.remove();
		assertEquals('a', actualData);
	}
	
	@Test
	public void add_ad_should_remove_ab() {
		c.add('a');
		c.add('b');
		assertEquals('a', c.remove());
		assertEquals('b', c.remove());
	}
	
	@Test
	public void buffer_empty_after_created() {
		assertTrue(c.isEmpty());
	}
	
	@Test
	public void buffer_not_empty_after_add_a() {
		c.add('a');
		assertFalse(c.isEmpty());
	}
	
	@Test
	public void add_ad_remove_ab_buffer_should_empty() {
		c.add('a');
		c.add('b');
		c.remove();
		c.remove();
		assertTrue(c.isEmpty());
	}
	
	@Test
	public void add_ad_remove_a_buffer_should_not_empty() {
		c.add('a');
		c.add('b');
		c.remove();
		assertFalse(c.isEmpty());
	}
	
	@Test
	public void multiple_add_and_remove_until_buffer_empty() {
		c.add('a');
		c.add('b');
		c.remove();
		c.remove();
		c.add('b');
		c.remove();		
		c.add('b');
		c.remove();
		assertTrue(c.isEmpty());
	}
}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitTester {

	public QuizOneJunit obj;
	
	@Before
	public void init() {
		obj = new QuizOneJunit();
	}
	
	
	@Test
	public void tc01() {
		assertEquals(4, obj.square(2));
	}

	
	@Test
	public void tc02() {
		assertEquals(1, obj.countLetterA("ABCD"));
	}
	
	@Test
	public void tc03() {
		assertEquals(0, obj.countLetterA("BCD"));
	}
	
	@Test
	public void tc04() {
		assertEquals(0, obj.countLetterA(""));
	}
	
	@Test
	public void tc05() {
		assertEquals(1, obj.countLetterA("abcd"));
	}
	
	@Test
	public void tc06() {
		assertEquals(2, obj.countLetterA("AaBbCcDd"));
	}
	
	@Test
	public void tc07() {
		assertTrue(obj.checkTwoLetter("AA"));
	}
	
	@Test
	public void tc08() {
		assertFalse(obj.checkTwoLetter("AB"));
	}
	
	@Test
	public void tc09() {
		assertFalse(obj.checkTwoLetter("ABC"));
	}
	
	@Test
	public void tc10() {
		assertEquals(false, obj.checkTwoLetter("ABC"));
	}
}

package epamtask;

import static org.junit.Assert.*;

import org.junit.Test;

public class epamtask {

	@Test
	public void test1() {
		javastrings t1 = new javastrings();
		String actual = t1.main1("Ab");
		assertEquals("b",actual);
	}
	public void test2() {
		javastrings t2 = new javastrings();
		String actual = t2.main1("AAb");
		assertEquals("b",actual);
		}
	public void test3() {
		javastrings t3 = new javastrings();
		String actual = t3.main1("bAA");
		assertEquals("bAA",actual);
	}
	public void test4() {
		javastrings t4 = new javastrings();
		String actual = t4.main1("AabAA");
		assertEquals("bAA",actual);
	}
}

package exp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ECT {

	@Test
	public void test1() {
		Next d = new Next();
		assertEquals(d.nextday(0,6,1912),"Invalid Values");
		
	}
	@Test
	public void test2() {
		Next d = new Next();
		assertEquals(d.nextday(32,6,1912),"Invalid Values");
	}
	@Test
	public void test3() {
		Next d = new Next();
		assertEquals(d.nextday(16,0,1912),"Invalid Values");
	}
	@Test
	public void test4() {
		Next d = new Next();
		assertEquals(d.nextday(16,13,1912),"Invalid Values");
	}
	@Test
	public void test5() {
		Next d = new Next();
		assertEquals(d.nextday(16,6,1811),"Invalid Values");
	}
	@Test
	public void test6() {
		Next d = new Next();
		assertEquals(d.nextday(16,6,2013),"Invalid Values");
	}
	@Test
	public void test7() {
		Next d = new Next();
		assertEquals(d.nextday(16,6,1912),"17/6/1912");
	}
	@Test
	public void test8() {
		Next d = new Next();
		assertEquals(d.nextday(16,8,1912),"17/8/1912");
	}
	@Test
	public void test9() {
		Next d = new Next();
		assertEquals(d.nextday(31,6,1912),"Invalid Values");
	}
	@Test
	public void test10() {
		Next d = new Next();
		assertEquals(d.nextday(16,2,2004),"17/2/2004");
	}
	@Test
	public void test11() {
		Next d = new Next();
		assertEquals(d.nextday(16,2,2000),"17/2/2000");
	}
	@Test
	public void test12() {
		Next d = new Next();
		assertEquals(d.nextday(16,2,1999),"17/2/1999");
	}
	@Test
	public void test13() {
		Next d = new Next();
		assertEquals(d.nextday(30,6,1912),"1/7/1912");
	}
	@Test
	public void test14() {
		Next d = new Next();
		assertEquals(d.nextday(31,12,1912),"1/1/1913");
	}
	@Test
	public void test15() {
		Next d = new Next();
		assertEquals(d.nextday(28,2,2008),"29/2/2008");
	}
	@Test
	public void test16() {
		Next d = new Next();
		assertEquals(d.nextday(29,2,2008),"1/3/2008");
	}


	
}
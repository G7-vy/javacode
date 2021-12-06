package exp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class triangle_test {

	@Test
	void test1() {
		triangle t=new triangle();
		assertEquals(t.chk(0, 100, 100),"invalid");
	}
	@Test
	void test2() {
		triangle t=new triangle();
		assertEquals(t.chk(100, 0, 100),"invalid");
	}
	@Test
	void test3() {
		triangle t=new triangle();
		assertEquals(t.chk(100, 100, 0),"invalid");
	}
	@Test
	void test4() {
		triangle t=new triangle();
		assertEquals(t.chk(201, 100, 100),"invalid");
	}
	@Test
	void test5() {
		triangle t=new triangle();
		assertEquals(t.chk(100,201, 100),"invalid");
	}
	@Test
	void test6() {
		triangle t=new triangle();
		assertEquals(t.chk(100, 100, 201),"invalid");
	}
	@Test
	void test7() {
		triangle t=new triangle();
		assertEquals(t.chk(3, 1, 1),"not a triangle");
	}
	@Test
	void test8() {
		triangle t=new triangle();
		assertEquals(t.chk(1,3,1),"not a triangle");
	}
	@Test
	void test9() {
		triangle t=new triangle();
		assertEquals(t.chk(1, 1,3),"not a triangle");
	}
	@Test
	void test10() {
		triangle t=new triangle();
		assertEquals(t.chk(1, 1, 1),"equilateral");
	}
	@Test
	void test11() {
		triangle t=new triangle();
		assertEquals(t.chk(1, 2, 2),"isosceles");
	}
	@Test
	void test12() {
		triangle t=new triangle();
		assertEquals(t.chk(2, 1, 2),"isosceles");
	}
	@Test
	void test13() {
		triangle t=new triangle();
		assertEquals(t.chk(2, 2, 1),"isosceles");
	}
	@Test
	void test14() {
		triangle t=new triangle();
		assertEquals(t.chk(3,4,5),"scalene");
	}

}

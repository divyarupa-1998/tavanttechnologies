package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld h = new HelloWorld();
		
		String a = h.getMessage();
		String b = "Hello World!";
		
		assertEquals(a,b);
	}

}
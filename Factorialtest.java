package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	Factorial f = new Factorial();
	
	@Test
	public void test() {
		int a = f.calculateFactorial(3);
		int b = 6;
		
		assertEquals(a,b);
	}

}
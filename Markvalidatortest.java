package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfevenoddTest {

	SumOfevenodd W = new SumOfevenodd();
	
	@Test
	public void testx() {		
		Integer a = W.sumOfEvenNumbers(2, 20);
		Integer b = 110;
		
		assertEquals(actual, expected);
	}

	@Test
	public void testy()
	{
		Integer a = W.sumOfOddNumbers(2, 20);
		Integer b = 100;
		
		assertEquals(a,b);	
	}
}
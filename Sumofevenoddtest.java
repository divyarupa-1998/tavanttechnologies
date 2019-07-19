package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	SumOfevenodd W = new SumOfevenodd();
	
	@Test
	public void testx() {		
		Integer a = W.sumOfEvenNumbers(2, 20);
		Integer b = 110;
		
		assertEquals(a,b );
	}

	@Test
	public void testy()
	{
		Integer a = W.sumOfOddNumbers(2, 20);
		Integer b= 100;
		
		assertEquals(a,b);	
	}
}
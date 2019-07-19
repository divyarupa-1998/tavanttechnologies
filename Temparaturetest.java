package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void test() {
		Temperature temp = new Temperature();
		Double a= temp.convertToCelcius(100);
		Double b= 37.78;
		
		assertEquals(a,b);
	}
	
	@Test
	public void test2() {
		Temperature temp = new Temperature();
		Double a= temp.convertToFarenheit(37.78);
		Double b= 100;
		
		assertEquals(a,b);
	}

}
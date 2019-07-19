package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class OOPSalltest {
	
	@Test
	public void test() {
		Book b1 = new Book("20", "20");
		Book b2 = new Book("25", "20");
		
		car c1 = new car("A","200000");
		car c2 = new car("r","5000000");
		
		projector p1 = new projector("40","50000");
		projector p2 = new projector("30","20000");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(p1);
		System.out.println(p2);
	}
}
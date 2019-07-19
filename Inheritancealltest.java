package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class InheritanceallTest {

	@Test
	public void test() {
		Shape Semi circle = new Semi circle(4);
		Shape Square = new Square(5);
		Shape Triangle = new Triangle(3,4,5);
		
		Semi circle.draw();
		Triangle.draw();
		Square.draw();
	
	}
}

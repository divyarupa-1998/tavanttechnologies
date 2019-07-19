package day1;

public class Square extends Shape{

	float side;
	public Square(float side)
	{
		super();
		this.side = side;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Square");
	}
}
© 2019 GitHub,
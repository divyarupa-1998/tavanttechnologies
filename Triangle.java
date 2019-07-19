package day1;

public class Triangle extends Shape{

	float a;
	float b;
	float c;
	
	
	public Triangle(float a, float b,float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("Triangle");
	}
}
© 2019 GitHub, Inc.
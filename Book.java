package day1;

public class Book {

	float height;
	float width;
	
	public Book(float height, float width) 
	{
		super();
		this.height = height;
		this.width  = width;
	}
	
	@Override
	public String toString() {
		return "Book[height=" + height + ", width=" + width + "]";
	}	
}

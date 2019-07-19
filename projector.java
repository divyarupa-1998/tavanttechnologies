package day1;

public class projector
{
	float size;
	float cost;
	
	public projector(char size, float cost) {
		super();
		this.size = size;
		this.cost= cost;
	}
	
	@Override
	public String toString() {
		return "projector[s=" + size + ", cost=" + cost + "]";
	}	
}
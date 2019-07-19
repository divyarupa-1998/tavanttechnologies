package day1;

public class car{

	float model;
	float cost;
	
	public car(char model, float cost) {
		super();
		this.model = model;
		this.cost= cost;
	}
	
	@Override
	public String toString() {
		return "car[h=" + model + ", cost=" + cost + "]";
	}	
}
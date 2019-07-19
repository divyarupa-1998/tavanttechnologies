package day1;

public class temperature {

	Double convertToFarenheit(Double celcius)
	{
		return celcius * 9 / 5 + 32;
	}
	
	Double convertToCelcius(Double farenheit)
	{
		return (farenheit - 32) * 5 / 9;
	}
}
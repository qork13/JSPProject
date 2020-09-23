package model;

public class TempConverter {
	
	//Declare variables to be used in object
	
	private double temp;
	private double celsius;
	private double farenheit;
	
	
	//Create no-arg constructor and a constructor that takes in the temp
	public TempConverter() {
		super();
	}

	public TempConverter(double temp) {
		super();
		this.temp = temp;
		setTemp(temp);
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
		setConvertTemp(temp);
	}

	//Getters and Setters for temp, celsius and farenheit
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFarenheit() {
		return farenheit;
	}

	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}

	public double getTemp() {
		return temp;
	}
	
	//Conversion method that takes the temp and runs it through the formula to either convert to Farenheit
	//or Celsius
	public void setConvertTemp(double temp) {
		setFarenheit((9 * temp / 5)  + 32);
		setCelsius((temp - 32) * 5 / 9);
	}

	//To String used to test the calculations before creating the result screen
	@Override
	public String toString() {
		return "TempConverter [celsius=" + celsius + ", farenheit=" + farenheit + "]";
	}
	
	
}

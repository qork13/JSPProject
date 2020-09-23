package model;

public class TempConverter {
	
	private double temp;
	private double celsius;
	private double farenheit;
	
	
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
	
	public void setConvertTemp(double temp) {
		setFarenheit((9 * temp / 5)  + 32);
		setCelsius(temp - 32 * 5 / 9);
	}

	@Override
	public String toString() {
		return "TempConverter [celsius=" + celsius + ", farenheit=" + farenheit + "]";
	}
	
	
}

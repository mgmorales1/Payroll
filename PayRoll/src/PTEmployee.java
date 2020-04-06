
public class PTEmployee extends Employee {
	private double hourlyRate;
	private int hoursWrkd;
	
	/* Takes string for name, social security number
	 * and department, double for hourly rate, and int for hours worked
	 * to create a Part Time Employee */
	public PTEmployee(String n, String ssnum, String d, double rate, int hours) {
		super(n, ssnum, d);
		this.hourlyRate = rate;
		this.hoursWrkd = hours;
	}
	
	/* Returns hourly rate as a double */
	public double getHourlyRate () {
		return this.hourlyRate;
	}
	
	/* Takes double to set hourly rate */
	public void setHourlyRate(double rate) {
		this.hourlyRate = rate;
	}
	
	/* Returns hours worked as an int */
	public int getHoursWorked() {
		return this.hoursWrkd;
	}
	
	/* Takes an int to set hours worked */
	public void setHoursWorked ( int hours) {
		this.hoursWrkd = hours;
	}
	
	/* Returns the weekly salary as a double */ 
	protected double getPay() {
		int extraHrs = 0;
		if (this.hoursWrkd > 40) {
			extraHrs = this.hoursWrkd - 40;
			return (hourlyRate * 40) + (extraHrs * (hourlyRate * 1.5));
		} else {
			return hoursWrkd * hourlyRate;
		}		
	}
	
	/* Returns string that indicates the employee type */
	public String toString() {
		return "PT";
	}

}

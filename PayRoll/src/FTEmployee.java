
public class FTEmployee extends Employee{
	private double salary;
	private int vacation;
	private boolean contracted;
	
	
	/* Takes string for name, social security number
	 * and department, double for salary, int for vacation days
	 * and boolean for contracted to create a Full Time Employee */
	public FTEmployee(String n, String ssnum,String d,double sal, int v, boolean c) {
		super(n, ssnum, d);
		this.salary = sal;
		this.vacation = v;
		this.contracted = c;
	}
	/* Returns salary as a double */
	public double getSalary() {
		return this.salary;
	}
	
	/* Takes double to set salary */
	public void setSalary( double salary) {
		this.salary = salary;
	}
	
	/* Returns vacation days as an int */
	public int getVacationDays() {
		return this.vacation;
	}
	
	/* Takes an int to set vacation days */
	public void setVacationDays(int days) {
		this.vacation = days;
	}
	
	/* Returns a boolean indicating if the employee is contracted or not*/
	public boolean getContract() {
		return this.contracted;
	}
	
	/* Takes boolean to set contract status of employee */
	public void setContract( boolean contract) {
		this.contracted = contract;
	}
	
	/*Returns monthly payment as a double */
	protected double getPay() {
		return salary / 12;
	}
	
	/* Returns string that indicates the employee type */ 
	public String toString() {
		return "FT";
	}

}


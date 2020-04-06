
public abstract class Employee {
	private String name;
	private String ssn;
	private String dept;
	
	/* Takes string for name, social security number
	 * and department to create an Employee*/
	public Employee(String n, String ssnum,String d ) {
		this.name = n;
		this.ssn = ssnum;
		this.dept = d;		
	}
	
	/* Returns the name as a String */
	public String getName() {
		return this.name;
	}
	
	/* Takes a String to set the name */
	public void setName(String name) {
		this.name = name;
	}
	
	/* Returns the social security number as a String */
	public String getSsn() {
		return this.ssn;
	}
	
	/* Takes a String to set social security number */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	/* Returns the department as a string */
	public String getDept() {
		return this.dept;
	}
	
	/* Takes a string to set the department */
	public void setDept(String dpt) {
		this.dept = dpt;
	}
	
	/* Returns the payment as a double */
	protected abstract double getPay();
	
		
	/* Returns a formated string with the name, social security number,
	 * department, and salary of the employee */
	public String getPayCheckData() {
		String data = String.format("Name: %-20s SSN:%-9s Department:%-9s October "
				+ "Pay:%9.2f", getName(), getSsn(), getDept(), getPay() );
		return data;
	}
	
}

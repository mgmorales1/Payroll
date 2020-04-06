
public class Manager extends FTEmployee {
	private int bonus;
	
	/* Takes string for name, social security number
	 * and department, double for salary, int for vacation days,
	 * boolean for contracted, and int for bonus to create a Manager */
	public Manager(String n, String ssnum,String d,double sal, int v, boolean c, int bon) {
		super(n, ssnum, d, sal, v, c);	
		this.bonus = bon;
	}
	
	/* Returns yearly bonus percentage as a double */
	public double getBonus() {
		return this.bonus;
	}
	 
	/* Takes an int to set the bonus percentage */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	/* Returns the total annual bonus as a double */
	public double getTotalBonus() {
		return (this.getBonus() / 100) * this.getSalary();
	}
	
	/* Returns monthly payment including bonus as a double */
	protected double getPay() {
		return (getSalary() / 12) + (getTotalBonus() / 12);

	}
	
	/* Returns string that indicates the employee type */
	public String toString() {
		return "MGR";
	}
	

}

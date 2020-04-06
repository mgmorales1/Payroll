import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {
	
	/* Function takes an ArrayList of employees as an argument
	 * and returns the paychecks of all employees*/
	public static void getMonthly(ArrayList<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPayCheckData());
		}
	}
	
	/* Function takes an ArrayList of employees as an argument
	 * and returns the paychecks of part time employees*/
	public static void getWeekly(ArrayList<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).toString().equals("PT")) {
				System.out.println(list.get(i).getPayCheckData());
			} else {
				continue;
			}
		}
	}
	
	

	public static void main(String[] args)throws FileNotFoundException, IOException {
		/* Stores the employees created */
		ArrayList<Employee> list = new ArrayList<Employee>();
		/* Scanner reads from a text file*/
		Scanner scan = new Scanner (new File ("employees.txt")); 
		
		
		
	    /* Reads each line of the text file and  
	     * creates the appropriate employee */		
		while (scan.hasNext()) {
			String type = scan.next();
			if (type.equals("FT")) {
				/* Full time employee is created and added to the ArrayList*/
				FTEmployee ftEmployee = new FTEmployee(scan.next() + " " + scan.next(), scan.next(), scan.next(), scan.nextDouble(), scan.nextInt(), scan.nextBoolean());
				list.add(ftEmployee);
			} else if (type.equals("MGR")) {
				/* Manager is created and added to the ArrayList*/
				Manager manager = new Manager(scan.next() + " " + scan.next(), scan.next(), scan.next(), scan.nextDouble(), scan.nextInt(), scan.nextBoolean(), scan.nextInt());
				list.add(manager);
			} else {
				/* Part time employee is created and added to the ArrayList*/
				PTEmployee ptEmployee = new PTEmployee(scan.next() + " " + scan.next(), scan.next(), scan.next(), scan.nextDouble(), scan.nextInt());
				list.add(ptEmployee);
			}
		}
		
		System.out.println("In what mode would you like to create the pay checks?"
				+ " Enter W for Weekly, M for monthly or X to exit the system.");
		/* New scanner to read from the user*/
		Scanner s = new Scanner(System.in);
		PrintStream c = System.out;
		
		/* Writes paychecks into the file "paysheet.txt*/
		PrintStream p = new PrintStream(new File("paysheet.txt"));
		System.setOut(p);
	
		String input = "";
		/* Uses the input read from the user to print Monthly or Weekly
		 * paychecks until the user decides to exit the system*/
		while( !input.equals("X")) {
			input = s.next();
			if (input.equals("W")) {
				getWeekly(list);
				System.out.println();
			} else if (input.equals("M")) {
				getMonthly(list);
				System.out.println();
			} 
		}
		
		System.setOut(c);
		/* Once the user input is X the system is exited*/
		System.out.println("Goodbye!");

		scan.close();
		s.close();
	} 	

}

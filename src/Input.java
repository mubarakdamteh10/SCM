import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
public class Input {
	static boolean lateDate = false;
	public Input(){
		LocalDate today = LocalDate.now();
        System.out.println("Current Date : " +today);
		String employeeId;
		String employeeName;
		int salary;
		double sales = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ID : ");
		employeeId = in.nextLine();
		System.out.print("Enter your Name : ");
		employeeName = in.nextLine();
		System.out.print("Enter your salary : ");
		salary = in.nextInt();
		Calculate c = new Calculate(employeeId, employeeName, salary, sales);
		int date = today.getDayOfMonth();
		Calendar cal = Calendar.getInstance();
		int lastDateOfMonth = cal.getActualMaximum(Calendar.DATE);
		if(date == lastDateOfMonth){
			System.out.print("Enter your sales : ");
			sales = in.nextDouble();
			c.setSales(sales);
			lateDate = true;
		}
		toString(lateDate, employeeId, employeeName, salary, sales);
		in.close();
	}

	public String toString(boolean lastDate, String employeeId, String employeeName, int salary, double sales){
		Calculate c = new Calculate(employeeId, employeeName, salary, sales);
		String employee = c.toString();
		if(lastDate == true) {
			double netSalary = c.calNetSalary();
			if(netSalary < 12000){
				double mixSalary = 12000 - netSalary;
				netSalary += mixSalary;
			}
			employee = employee + " netSalary : " + netSalary;
		}
		System.out.println(employee);
		return employee;
	}
}
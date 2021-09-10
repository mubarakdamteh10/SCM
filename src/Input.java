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
		double sales;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ID : ");
		employeeId = in.nextLine();
		System.out.print("Enter your Name : ");
		employeeName = in.nextLine();
		System.out.print("Enter your salary : ");
		salary = in.nextInt();
		Calculate c = new Calculate(employeeId, employeeName, salary);
		int date = today.getDayOfMonth();
		Calendar cal = Calendar.getInstance();
		int lastDateOfMonth = cal.getActualMaximum(Calendar.DATE);
		if(date == lastDateOfMonth){
			System.out.print("Enter your sales : ");
			sales = in.nextDouble();
			c.setSales(sales);
			lateDate = true;
		}
		toString(employeeId, employeeName, salary);
		in.close();
	}

	public String toString(String employeeId, String employeeName, int salary){
		Calculate c = new Calculate(employeeId, employeeName, salary);
		String employee = c.toString();
		if(lateDate == true) {
			employee = employee + " netSalary : " + c.calNetSalary();
		}
		System.out.println(employee);
		return employee;
	}
}
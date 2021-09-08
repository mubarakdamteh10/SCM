
public class Calculate {
    private String employeeId;
    private String employeeName;
    private int salary;
    private Double sales;
    
    public Calculate(){

    }

    public Calculate(String employeeId, String employeeName, int salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSales(Double sales){
        this.sales = sales;
    }
    
    public double calNetSalary(){
        double netSalary = 0.00;
        if(this.salary <= 50000){
            netSalary = salary * 1.05;
        } else {
            netSalary = salary *1.10;
        }
        return netSalary;
    }
    
    public String toString(){
        return "employeeId : " + this.employeeId + " employeeName : " + this.employeeName + " salary : " + this.salary;
    }
}
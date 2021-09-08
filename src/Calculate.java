
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
        if(this.salary <= 10000){
            if(this.sales <= 50000){
                netSalary = this.salary * 1.05;
            } else {
                netSalary = this.salary * 1.10;
            }
        } else {
            if(this.salary <= 100000) {
                netSalary = this.salary * 1.05;
            } else {
                netSalary = this.salary * 1.10;
            }
        }
        return netSalary;
    }
    
    public String toString(){
        return "employeeId : " + this.employeeId + " employeeName : " + this.employeeName + " salary : " + this.salary;
    }
}
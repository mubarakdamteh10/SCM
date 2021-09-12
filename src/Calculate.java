
public class Calculate {
    private String employeeId;
    private String employeeName;
    private int salary;
    private double sales;
    
    public Calculate(){

    }

    public Calculate(String employeeId, String employeeName, int salary, double sales){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.sales = sales;
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
        if (this.sales >= 1 && this.sales <= 50000){
            netSalary = this.salary + (this.sales * 0.05);
        } else if (this.sales > 50000) {
            netSalary = this.salary + (this.sales * 0.10);
        }
        return netSalary;
    }
    
    public String toString(){
        return "employeeId : " + this.employeeId + " employeeName : " + this.employeeName + " salary : " + this.salary;
    }
}
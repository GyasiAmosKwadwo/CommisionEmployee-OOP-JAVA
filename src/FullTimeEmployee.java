public class FullTimeEmployee extends Employee {
    private double salary;

    // Constructor
    public FullTimeEmployee(String name, String employeeId, double salary) {
        super(name, employeeId); // Call the superclass constructor
        this.salary = salary;    // Initialize salary
    }
    public void calculatePay() {
        System.out.println("Full Time Employee Salary: " + salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
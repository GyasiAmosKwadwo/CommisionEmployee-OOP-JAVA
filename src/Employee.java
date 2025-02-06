public abstract class Employee {
    private String name;
    private String employeeId;

    // Constructor
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    public abstract void calculatePay();

}

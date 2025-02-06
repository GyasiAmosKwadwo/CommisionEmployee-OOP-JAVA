//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            // Creating the BaseCommissionEmployee using the six arg. constructor
            BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                    "Amos", "Gyasi", "222-451-33", 700, 0.2, 100);

            // Displaying initial details
            System.out.println("Initial Employee Details:");
            System.out.println(employee);
            System.out.println("Earnings: " + employee.earnings());

            // Update baseSalary, grossSales, and commissionRate
            employee.setBaseSalary(1200);
            employee.setGrossSales(7000);
            employee.setCommissionRate(0.25);

            // Displaying Updated details
            System.out.println("\nUpdated Employee Details:");
            System.out.println(employee);
            System.out.println("Earnings: " + employee.earnings());

            // Testing validation
            try {
                employee.setBaseSalary(-500); // Invalid baseSalary
            } catch (IllegalArgumentException e) {
                System.out.println("\nException caught: " + e.getMessage());
            }

            try {
                employee.setGrossSales(-2000); // Invalid grossSales
            } catch (IllegalArgumentException e) {
                System.out.println("\nException caught: " + e.getMessage());
            }

            try {
                employee.setCommissionRate(1.5); // Invalid commissionRate
            } catch (IllegalArgumentException e) {
                System.out.println("\nException caught: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Nana", "000340221", 1000);
        System.out.println(
                " Name: " + fullTimeEmployee.getName() + "\n" +
                " ID: " + fullTimeEmployee.getEmployeeId() + "\n" +
                " Salary: " + fullTimeEmployee.getSalary()

        );

        fullTimeEmployee.calculatePay();

        //Testing the caculatePay  method with differen value
        fullTimeEmployee.setSalary(400);
        fullTimeEmployee.calculatePay();

    }

}
public class ComissionEmployee {
    private String firstName;
    private String lastName;
    private String SocialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public ComissionEmployee(String firstName,String lastName,String SocialSecurityNumber,double commissionRate,double grossSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = SocialSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    //Getters And Setters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber(){
        return SocialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }
    public void setGrossSales(double grossSales){
        if (grossSales <0){
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        else{
            this.grossSales = grossSales;
        }
    }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException("Commission rate must be between 0 and 1");
        }
        else {
            this.commissionRate = commissionRate;
        }
    }

    //Other Methods
    public double earnings(double grossSales,double commissionRate){
       double earning = grossSales*commissionRate;
       return earning;
    }

    public String toString(){
        return "First Name: " + this.firstName + " LastName: " + lastName + " Social Security Number: " + SocialSecurityNumber + " Commission Rate: " + commissionRate + " Gross Sales: " + grossSales;
    }


}


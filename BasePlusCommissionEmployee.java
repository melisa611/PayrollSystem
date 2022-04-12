public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    /** Constructors. */
    public BasePlusCommissionEmployee(){}

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String ssn, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    /** Getter and setter methods. */
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /** ToString method. */
    public String toString(){
        return "Salaried Employee: " + getFirstName() + getLastName() +
                "\nsocial security number: " + getSsn() +
                "\ngross sales: "+ getGrossSales() +
                "; " + "commission rate: " + getCommissionRate() +
                "; " + "Base salary: " + getBaseSalary() +
                "\nearned: " + getEarning();
    }

    /** Abstract method. */
    @Override
    public double getEarning(){
        return (commissionRate* grossSales) + baseSalary;
    }
}

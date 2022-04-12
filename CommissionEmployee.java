public class CommissionEmployee extends Employee{
    public double grossSales;
    public double commissionRate;

    /** Constructors. */
    public CommissionEmployee() {
    }

    public CommissionEmployee(String firstName, String lastName, String ssn,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    /** Getter and Setter methods. */
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    /** ToString method. */
    public String toString(){
        return "Salaried Employee: " + getFirstName() + getLastName() +
                "\nsocial security number: " + getSsn() +
                "\ngross sales: "+ getGrossSales() +
                "; " + "commission rate: " + getCommissionRate() +
                "\nearned: " + getEarning();
    }

    /** Abstract method. */
    @Override
    public double getEarning(){
        return commissionRate*grossSales;
    }
}

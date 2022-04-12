public class SalariedEmployee extends Employee{
    private double weeklySalary;

    /** Constructors of SalariedEmployee class. */
    public SalariedEmployee(){}

    public SalariedEmployee(String firstName, String lastName,
                            String ssn, double weeklySalary){
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    /** Getter and setter methods. */
    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    /** ToString method. */
    @Override
    public String toString(){
        return "Salaried Employee: " + getFirstName() + getLastName() +
                "\nsocial security number: " + getSsn() +
                "\nweekly salary: "+ getWeeklySalary() +
                "\nearned: " + getEarning();
    }


    /** Abstract method from superclass. */
    @Override
    public double getEarning(){
        return weeklySalary;
    }
}

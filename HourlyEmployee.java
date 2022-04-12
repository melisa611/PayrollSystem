public class HourlyEmployee extends Employee{
    private double wage;
    private int hours;

    /** Constructor. */
    public HourlyEmployee(){}

    public HourlyEmployee(String firstName, String lastName,
                          String ssn, double wage, int hours){
        super(firstName, lastName, ssn);
        this.hours = hours;
        this.wage = wage;
    }

    /** Getter and setter methods. */
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    /** ToString method. */
    public String toString(){
        return "Salaried Employee: " + getFirstName() + getLastName() +
                "\nsocial security number: " + getSsn() +
                "\nhourly wage: "+ getWage() +
                "; " + "hours worked: " + getHours() +
                "\nearned: " + getEarning();
    }

    /** Abstract method from superclass. */
    @Override
    public double getEarning(){
        if (hours <=40){
            return wage*hours;
        }
        else if (hours > 40){
            return 40*wage + (hours - 40)*wage*1.5;
        }
        else
            return 0;
    }
}

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    /** Constructors. */
    public Employee(){}

    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    /**Getter and setter methods for variables. */
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;


    }
    /** ToString method. */


    /** Abstract method SSN. */
    public abstract double getEarning();

}

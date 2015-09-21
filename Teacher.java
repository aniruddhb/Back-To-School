public class Teacher extends Person{
    private String mySubject;
    private double mySalary;

    public Teacher(String myName, int myAge, String myGender, String subject, double salary){
        super(myName, myAge, myGender);
        mySubject = subject;
        mySalary = salary;
    }
    
    public String getSubject(){
        return mySubject;
    }
    
    public double getSalary(){
        return mySalary;
    }

    public void setSubject(String subject){
        mySubject = subject;
    }
    
    public void setSalary(double salary){
        mySalary = salary;
    }
    
    public String toString(){
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}

package OopFourBasePrinciple.Inheritance;

public class InformationTechnologies extends Employee{
    private String task;

    public InformationTechnologies(String fullName, String phoneNumber, String email, String department, String shift,String task){
        super(fullName,phoneNumber,email,department,shift);
        this.task = task;
    }

    public String getTask(){
        return this.task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public void networkSetup(){
        System.out.println("network setup finished by " + this.getFullName());
    }

    @Override
    public void login()
    {
        System.out.println(this.getFullName() + " is logged the university");
    }

    @Override
    public void logout(){
        System.out.println(this.getFullName() + " is logged out of university");
    }

    @Override
    public void refectory() {
        System.out.println(this.getFullName() + " is logged the refectory");
    }

    @Override
    public void work() {
        System.out.println(this.getFullName()+" employee started working");
    }
}

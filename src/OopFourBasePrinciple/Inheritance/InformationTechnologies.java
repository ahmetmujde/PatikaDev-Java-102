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
}

package OopFourBasePrinciple.Inheritance;

public class SecurityGuard extends Employee{
    private String document;

    public SecurityGuard(String fullName, String phoneNumber, String email, String department, String shift, String document){
        super(fullName,phoneNumber,email,department,shift);
        this.document = document;
    }

    public String getDocument(){
        return this.document;
    }

    public void setDocument(){
        this.document = document;
    }

    public void guardDuty(){
        System.out.println("Security Guard " +this.getFullName() + " started guard duty");
    }
}

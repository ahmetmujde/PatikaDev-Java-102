package OopFourBasePrinciple.Inheritance;

public class Assistant extends Academician{

    private String officeHours;

    public Assistant(String fullName, String phoneNumber, String email, String department, String title, String officeHours){
        super(fullName, phoneNumber, email, department, title);
        this.officeHours = officeHours;
    }

    public String getOfficeHours(){
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public void takeAQuiz(){
        System.out.println(this.getFullName()+" started a quiz ");
    }
}

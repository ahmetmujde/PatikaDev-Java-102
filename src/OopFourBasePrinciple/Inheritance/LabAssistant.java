package OopFourBasePrinciple.Inheritance;

public class LabAssistant extends  Assistant{
    public LabAssistant(String fullName, String phoneNumber, String email, String department, String title, String officeHours) {
        super(fullName, phoneNumber, email, department, title, officeHours);
    }

    public void logInTheLab(){
        System.out.println(this.getFullName()+" is logged the laboratory");
    }

    public void logInTheLesson(){
        System.out.println(this.getFullName()+" is logged the lesson");
    }
}

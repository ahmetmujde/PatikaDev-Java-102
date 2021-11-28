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
    public void loginLesson() {
        System.out.println(this.getFullName() + " is logged the lesson");
    }

}

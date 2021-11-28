package OopFourBasePrinciple.Inheritance;

public class Instructor extends Academician{
    private String doorNumber;

    public Instructor(String fullName, String phoneNumber, String email, String department, String title, String doorNumber) {
        super(fullName, phoneNumber, email, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void senateMeet(){
        System.out.println(this.getFullName()+" started a meeting in room : " + this.doorNumber);
    }

    public void takeAExam(){
        System.out.println(this.getFullName()+" started a exam ");
    }

    @Override
    public void login(){
        System.out.println(this.getFullName() + " is logged the university from called I door");
    }

    @Override
    public void loginLesson(){
        System.out.println(this.getFullName() + " is logged the lesson");
    }

    @Override
    public void logout(){
        System.out.println(this.getFullName() + " is logged out of university");
    }

    @Override
    public void refectory() {
        System.out.println(this.getFullName() + " is logged the refectory");
    }

}

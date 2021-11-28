package OopFourBasePrinciple.Inheritance;

public abstract class Academician extends Worker{
    private String department;
    private String title;

    public Academician(String fullName,String phoneNumber,String email, String department, String title){
        super(fullName,phoneNumber,email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void loginLesson();
}

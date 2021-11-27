package OopFourBasePrinciple.Inheritance;

public class Employee extends Worker{
    private String department;
    private String shift;

    public Employee(String fullName, String phoneNumber, String email, String department, String shift){
        super(fullName,phoneNumber,email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getFullName()+" employee started working");
    }


}

package OopFourBasePrinciple.Inheritance;

public class Worker {
    private String fullName;
    private String phoneNumber;
    private String email;

    public Worker(String fullName, String phoneNumber, String email){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void  setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public void login(){
        System.out.println(this.fullName + " is logged the university");
    }

    public void logout(){
        System.out.println(this.fullName + " is logged out of university");
    }

    public void refectory(){
        System.out.println(this.fullName + " is logged the refectory");
    }
}

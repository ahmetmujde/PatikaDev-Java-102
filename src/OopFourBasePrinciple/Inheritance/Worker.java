package OopFourBasePrinciple.Inheritance;

public abstract class Worker {
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

    public abstract void login();

    public abstract void logout();

    public abstract void refectory();

    // created for loop  to Polymorphism
    public static void usersLoggedIn(Worker[] loginUsers){
        for (Worker w : loginUsers) {
            w.login();
        }
    }

}

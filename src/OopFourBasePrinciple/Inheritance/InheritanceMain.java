package OopFourBasePrinciple.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        /*
        //worker,academician and Employee class are abstract class that is why we convert to command block

        Worker w1 = new Worker("exampleWorker","0xxx-xxx-xxxx","xworker@email");

        Academician a1 = new Academician("exampleAcademician","1xxx-xxx-xxxx",
                "xacademician@email","CENG","Professor");

        Employee e1 = new Employee("exampleEmployee","5xxx-xxx-xxxx","xEmployee@email"
                ,"SEC","08:30-17:30");
        */

        // Instructor definition
        Instructor i1 = new Instructor("exampleInstructor","2xxx-xxx-xxxx",
                "xInstructor@email","CENG","Instructor","202");

        //Assistant definition
        Assistant as1 = new Assistant("exampleAssistant","3xxx-xxx-xxxx",
                "xAssistant@email","CENG","Assistant","09:00-17:30");

        //LabAssistant definition
        LabAssistant la1 = new LabAssistant("exampleLabAssistant","4xxx-xxx-xxxx",
                "xLabAssistant@email","CENG","LabAssistant","09:00-18:30");

        // SecurityGuard definition
        SecurityGuard sg1 = new SecurityGuard("exampleSecurityGuard","6xxx-xxx-xxxx","xSecurityGuard@email"
                ,"SECGUA","00:00-08:00","document");

        // InformationTechnologies definition
        InformationTechnologies iT1 = new InformationTechnologies("exampleIT","7xxx-xxx-xxxx","xIT@email"
                ,"IT","08:00-18:00","network");


        //standard notation in the console
        //bringing  the functions of the worker
        System.out.println("-------Information about of the assistant-------");
        System.out.println(as1.getFullName());
        System.out.println(as1.getPhoneNumber());
        System.out.println(as1.getEmail());
        as1.login();
        as1.logout();
        as1.refectory();

        System.out.println("\n----- method overloading and  method override -----");
        //run to method override
        i1.login();

        System.out.println("\n----- Polymorphism's print -----");
        //Polymorphism
        //create object variable
        //int[] loginUsers = new int[5]
        Worker[] loginUsers = {i1,as1,la1,sg1,iT1};
        Worker.usersLoggedIn(loginUsers);

        System.out.println("\n----- lab Assistant print -----");
        la1.refectory();

        System.out.println("\n----- Information Technologies print -----");
        iT1.logout();
    }
}

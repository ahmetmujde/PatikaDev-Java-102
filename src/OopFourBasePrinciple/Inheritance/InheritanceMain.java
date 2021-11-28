package OopFourBasePrinciple.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        //worker definition
        Worker w1 = new Worker("exampleWorker","0xxx-xxx-xxxx","xworker@email");

        // academician definition
        Academician a1 = new Academician("exampleAcademician","1xxx-xxx-xxxx",
                "xacademician@email","CENG","Professor");
        // Instructor definition
        Instructor i1 = new Instructor("exampleInstructor","2xxx-xxx-xxxx",
                "xInstructor@email","CENG","Instructor","202");

        //Assistant definition
        Assistant as1 = new Assistant("exampleAssistant","3xxx-xxx-xxxx",
                "xAssistant@email","CENG","Assistant","09:00-17:30");

        //LabAssistant definition
        LabAssistant la1 = new LabAssistant("exampleLabAssistant","4xxx-xxx-xxxx",
                "xLabAssistant@email","CENG","LabAssistant","09:00-18:30");

        //Employee definition
        Employee e1 = new Employee("exampleEmployee","5xxx-xxx-xxxx","xEmployee@email"
                ,"SEC","08:30-17:30");


        // SecurityGuard definition
        SecurityGuard sg1 = new SecurityGuard("exampleSecurityGuard","6xxx-xxx-xxxx","xSecurityGuard@email"
                ,"SECGUA","00:00-08:00","document");

        // InformationTechnologies definition
        InformationTechnologies iT1 = new InformationTechnologies("exampleIT","7xxx-xxx-xxxx","xIT@email"
                ,"IT","08:00-18:00","network");

        //standard notation in the console
        //bringing  the functions of the worker
        System.out.println("-------Information about of the worker-------");
        System.out.println(w1.getFullName());
        System.out.println(w1.getPhoneNumber());
        System.out.println(w1.getEmail());
        w1.login();
        w1.logout();
        w1.refectory();

        System.out.println("\n----- method overloading and  method override -----");

        //run to method overloading
        i1.login("08:15");

        //run to method override
        i1.login();

        System.out.println("\n----- Polymorphism's print -----");
        //Polymorphism
        //create object variable
        //int[] loginUsers = new int[5]
        Worker[] loginUsers = {w1,a1,i1,as1,la1,e1,sg1,iT1};
        Worker.usersLoggedIn(loginUsers);
    }
}

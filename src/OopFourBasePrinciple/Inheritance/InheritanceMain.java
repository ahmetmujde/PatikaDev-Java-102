package OopFourBasePrinciple.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        //worker definition
        Worker w1 = new Worker("exampleWorker","0xxx-xxx-xxxx","xworker@email");

        //bringing  the functions of the worker
        System.out.println("-------Information about of the worker-------");
        System.out.println(w1.getFullName());
        System.out.println(w1.getPhoneNumber());
        System.out.println(w1.getEmail());
        w1.login();
        w1.logout();
        w1.refectory();

        // academician definition
        Academician a1 = new Academician("exampleAcademician","1xxx-xxx-xxxx",
                "xacademician@email","CENG","Professor");

        //bringing  the functions of the academician
        System.out.println("\n-------Information about of the academician-------");
        System.out.println(a1.getFullName());
        System.out.println(a1.getPhoneNumber());
        System.out.println(a1.getEmail());
        System.out.println(a1.getDepartment());
        System.out.println(a1.getTitle());
        a1.loginLesson();

        // Instructor definition
        Instructor i1 = new Instructor("exampleInstructor","2xxx-xxx-xxxx",
                "xInstructor@email","CENG","Instructor","202");

        //bringing  the functions of the Instructor
        System.out.println("\n-------Information about of the Instructor-------");
        System.out.println(i1.getFullName());
        System.out.println(i1.getPhoneNumber());
        System.out.println(i1.getEmail());
        System.out.println(i1.getDepartment());
        System.out.println(i1.getTitle());
        System.out.println(i1.getDoorNumber());
        i1.senateMeet();
        i1.takeAExam();

        //Assistant definition
        Assistant as1 = new Assistant("exampleAssistant","3xxx-xxx-xxxx",
                "xAssistant@email","CENG","Assistant","09:00-17:30");
        //bringing  the functions of the Assistant
        System.out.println("\n-------Information about of the Assistant-------");
        System.out.println(as1.getFullName());
        System.out.println(as1.getPhoneNumber());
        System.out.println(as1.getEmail());
        System.out.println(as1.getDepartment());
        System.out.println(as1.getTitle());
        System.out.println(as1.getOfficeHours());
        as1.takeAQuiz();

        //LabAssistant definition
        LabAssistant la1 = new LabAssistant("exampleLabAssistant","4xxx-xxx-xxxx",
                "xLabAssistant@email","CENG","LabAssistant","09:00-18:30");

        //bringing  the functions of the LabAssistant
        System.out.println("\n-------Information about of the LabAssistant-------");
        System.out.println(la1.getFullName());
        System.out.println(la1.getPhoneNumber());
        System.out.println(la1.getEmail());
        System.out.println(la1.getDepartment());
        System.out.println(la1.getTitle());
        System.out.println(la1.getOfficeHours());
        la1.takeAQuiz();
        la1.logInTheLab();
        la1.loginLesson();

        //Employee definition
        Employee e1 = new Employee("exampleEmployee","5xxx-xxx-xxxx","xEmployee@email"
                ,"SEC","08:30-17:30");

        //bringing  the functions of the Employee
        System.out.println("\n-------Information about of the Employee-------");
        System.out.println(e1.getFullName());
        System.out.println(e1.getPhoneNumber());
        System.out.println(e1.getEmail());
        System.out.println(e1.getDepartment());
        System.out.println(e1.getShift());
        e1.work();

        // SecurityGuard definition
        SecurityGuard sg1 = new SecurityGuard("exampleSecurityGuard","6xxx-xxx-xxxx","xSecurityGuard@email"
                ,"SECGUA","00:00-08:00","document");

        //bringing  the functions of the SecurityGuard
        System.out.println("\n-------Information about of the SecurityGuard-------");
        System.out.println(sg1.getFullName());
        System.out.println(sg1.getPhoneNumber());
        System.out.println(sg1.getEmail());
        System.out.println(sg1.getDepartment());
        System.out.println(sg1.getShift());
        System.out.println(sg1.getDocument());
        sg1.guardDuty();

        // InformationTechnologies definition
        InformationTechnologies iT1 = new InformationTechnologies("exampleIT","7xxx-xxx-xxxx","xIT@email"
                ,"IT","08:00-18:00","network");

        //bringing  the functions of the InformationTechnologies
        System.out.println("\n-------Information about of the InformationTechnologies-------");
        System.out.println(iT1.getFullName());
        System.out.println(iT1.getPhoneNumber());
        System.out.println(iT1.getEmail());
        System.out.println(iT1.getDepartment());
        System.out.println(iT1.getShift());
        System.out.println(iT1.getTask());
        iT1.networkSetup();

        System.out.println("\n\n");

        //run to method overloading
        i1.login("08:15");

        //run to method override
        i1.login();


    }
}

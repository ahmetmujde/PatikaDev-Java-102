package OopFourBasePrinciple.RelationshipsBetweenClasses;

public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor){
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Course uses a Student
    public  double calcAverage(Student[] students){
        double average = 0.0;

        for (int i = 0; i < students.length; i++) {
            average += students[i].getNote();
        }
        return  average / students.length;
    }
}

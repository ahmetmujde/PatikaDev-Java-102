package RelationshipsBetweenClasses;

public class RbcMain {
    public static void main(String[] args) {
        Student st1 = new Student("Harry","Potter","001","hogwarts",80);
        Student st2 = new Student("Ronald","Weasley","002","hogwarts",60);
        Student st3 = new Student("Hermione","Granger","003","hogwarts",100);

        Instructor teacher = new Instructor("Severus", "Snape","MAT101");

        Course mat = new Course("MAT101","101",teacher);

        //composition, aggregation
        //course has a Instructor
        System.out.println(mat.getInstructor().getName());

        Student[] stu = {st1,st2,st3};
        System.out.println("Average of students note: " + mat.calcAverage(stu));
    }
}

import StaticMethod.Student;

public class Main {
    public static <Student1, Student2, Student3> void main(String[] args) {
        Student.change();
        Student1 s1= (Student1) new Student( 1, "Huy");
        Student2 s2= (Student2) new Student( 2 ,"Ha");
        Student3 s3= (Student3) new Student( 3, "Nhat Anh");

        s1.toString();
        s2.toString();
        s3.toString();

    }
}
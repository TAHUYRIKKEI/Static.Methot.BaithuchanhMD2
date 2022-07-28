package StaticMethod;

public class Student {
    private int rollNo;
    private String name;
    public static String collage = "BBDIT";


    public Student(int R, String n){
        int r = 0;
        rollNo = r;
        name = n;
    }
    public static void change(){
        collage = "KHONG DUOC BO CUOC";
    }
}

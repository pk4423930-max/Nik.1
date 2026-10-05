public class ClassDemo { 
    public static void main(String[] args){ 
        Student st1 = new Student(); 
        st1.name = 23; 
        st1.dept = "AI"; 
        Student st2 = new Student(23, 312, "AI"); 
        System.out.println(st2.dept); 
        System.out.println(Student.bloodgroup); 
        Student.doExams(); 
    } 
} 

class Student {
    int name; 
    int rollNo; 
    String dept;
    static String bloodgroup = "O+";

    public Student() {
    }

    public Student(int name, int rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }

    public static void doExams() {
        System.out.println("Exam in progress");
    }
}

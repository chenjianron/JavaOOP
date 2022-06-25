import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jarrell", 23, '男', 1);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getId());
    }
}

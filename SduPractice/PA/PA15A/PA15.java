package SduPractice.PA.PA15A;

public class PA15 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "123 Main St", "555-1234");
        System.out.println(person.toString());
        Student student = new Student("Jane Smith", 20, "456 Park Ave",
                "555-5678", 1234, "Computer Science");
        System.out.println(student.toString());
        Teacher teacher = new Teacher("Bob Johnson", 45, "789 Broadway",
                "555-9012", "Math");
        System.out.println(teacher.toString());
    }
}

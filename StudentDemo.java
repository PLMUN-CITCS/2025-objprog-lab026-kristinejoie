// Student class definition
class Student {
    // Private attributes (encapsulation)
    private String name;
    private int id;
    private double gpa;

    // Static variable to keep track of total students
    private static int studentCount = 0;

    // Constructor to initialize name, id, and gpa; increment studentCount
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++; // Increment static student count
    }

    // Instance method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students created
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        // Creating objects of the Student class
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Displaying student details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Displaying total student count using the static method
        Student.displayStudentCount();
    }
}
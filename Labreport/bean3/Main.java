package bean3;

public class Main {
    public static void main(String[] args) {
        // Create first student
        Student s1 = new Student();
        s1.setName("Ujjwal");
        s1.setMarks(45); // Passed

        System.out.println("Student Result:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
        System.out.println("Passed: " + (s1.isPassed() ? "Yes " : "No "));

        // Second student
        Student s2 = new Student();
        s2.setName("Ram");
        s2.setMarks(35); // Failed

        System.out.println("\nStudent Result:");
        System.out.println("Name: " + s2.getName());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Passed: " + (s2.isPassed() ? "Yes " : "No "));
    }
}

// Inner Student class
class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public boolean isPassed() {
        return marks >= 40;
    }
}

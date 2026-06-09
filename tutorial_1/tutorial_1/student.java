class Student {
    // Attributes
    String name;
    int age;
    double gpa;

    // Constructor
    Student(String studentName, int studentAge, double studentGPA) {
        name = studentName;
        age = studentAge;
        gpa = studentGPA;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

//another method
public void study() {
    system.out.println(studentName + "is studying.");
}

// another method
public void takeExam() {
    system.out.println(studentName + "is taking an exam.");

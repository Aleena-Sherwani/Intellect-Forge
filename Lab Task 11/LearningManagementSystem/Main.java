public class Main {
    public static void main(String[] args) {
        // Create courses
        Course c1 = new Course("Mathematics", "MTH101");
        Course c2 = new Course("Programming", "CS102");
        Course c3 = new Course("Physics", "PHY103");

        // Create student
        Student s1 = new Student("Ali", "S001");
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        Student s2 = new Student("Sara", "S002");
        s2.enrollCourse(c3);

        // Your details (Aleena Irshad Sherwani)
        Student aleena = new Student("Aleena Irshad Sherwani", "B24110006015");
        aleena.enrollCourse(c1);
        aleena.enrollCourse(c2);
        aleena.enrollCourse(c3);

        // Student List
        StudentList studentList = new StudentList();
        studentList.addStudent(s1);
        studentList.addStudent(s2);
        studentList.addStudent(aleena);

        // Display Students
        System.out.println(studentList);

        // Search student
        System.out.println("Search by Name (Aleena): " + studentList.searchByName("Aleena Irshad Sherwani"));

        // Sort students
        studentList.sortByName();
        System.out.println("Sorted by Name:\n" + studentList);
    }
}
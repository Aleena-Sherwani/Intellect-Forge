public class Student {
    private String name;
    private String seatNo;
    private CourseList courses;

    public Student(String name, String seatNo) {
        this.name = name;
        this.seatNo = seatNo;
        this.courses = new CourseList(10); // Default max 10 courses
    }

    public Student(String name, String seatNo, CourseList courses) {
        this.name = name;
        this.seatNo = seatNo;
        this.courses = courses;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public CourseList getCourses() {
        return courses;
    }

    public boolean enrollCourse(Course course) {
        return courses.addCourse(course);
    }

    public boolean dropCourse(String code) {
        return courses.removeCourse(code);
    }

    @Override
    public String toString() {
        return "Student{Name='" + name + "', SeatNo='" + seatNo + "', " + courses.toString() + "}";
    }
}
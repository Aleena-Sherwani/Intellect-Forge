import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public boolean removeStudent(String seatNo) {
        return students.removeIf(s -> s.getSeatNo().equalsIgnoreCase(seatNo));
    }

    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public Student searchBySeatNo(String seatNo) {
        for (Student s : students) {
            if (s.getSeatNo().equalsIgnoreCase(seatNo)) {
                return s;
            }
        }
        return null;
    }

    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
    }

    public void sortBySeatNo() {
        students.sort(Comparator.comparing(Student::getSeatNo));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student List:\n");
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
import java.util.Arrays;
import java.util.Comparator;

public class CourseList {
    private Course[] courses;
    private int count;
    private int size;

    public CourseList(int size) {
        this.size = size;
        this.courses = new Course[size];
        this.count = 0;
    }

    public boolean addCourse(Course course) {
        if (count < size) {
            courses[count++] = course;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String code) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getCode().equals(code)) {
                courses[i] = courses[count - 1];
                courses[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Course searchByName(String name) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getName().equalsIgnoreCase(name)) {
                return courses[i];
            }
        }
        return null;
    }

    public Course searchByCode(String code) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getCode().equalsIgnoreCase(code)) {
                return courses[i];
            }
        }
        return null;
    }

    public void sortByCode() {
        Arrays.sort(courses, 0, count, Comparator.comparing(Course::getCode));
    }

    public void sortByName() {
        Arrays.sort(courses, 0, count, Comparator.comparing(Course::getName));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Courses: \n");
        for (int i = 0; i < count; i++) {
            sb.append(courses[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
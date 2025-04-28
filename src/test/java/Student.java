import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void promoteToNextCourse() {
        if (getAverageGrade() >= 3) {
            course++;
        }
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
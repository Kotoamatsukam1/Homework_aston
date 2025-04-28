import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Set<Student> students = new HashSet<>();
        students.add(new Student("Дзюба", "A1", 1, Map.of("Математика", 4, "Физика", 2)));
        students.add(new Student("Аршавин", "A1", 1, Map.of("Математика", 3, "Физика", 3)));
        students.add(new Student("Смолов", "A1", 1, Map.of("Математика", 5, "Физика", 5)));

        StudentUtils.removeLowPerformingStudents(students);
        StudentUtils.promoteStudents(students);
        StudentUtils.printStudents(students, 2);

        // Задание 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Дзюба", "+375(33)3434343");
        phoneBook.add("Дзюба", "+375(33)9191919");
        phoneBook.add("Смолов", "+375(33)5252525");

        System.out.println("Телефоны Дзюбы : " + phoneBook.get("Дзюба"));
        System.out.println("Телефоны Смолова: " + phoneBook.get("Смолов"));
    }
}
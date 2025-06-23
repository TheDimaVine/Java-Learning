package week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.println("Введіть вік: ");
        int age = scanner.nextInt();
        System.out.println("Введіть групу: ");
        String group = scanner.nextLine();
        group = scanner.nextLine();

        manager.addStudent(new Student(name, age, group));
        manager.addStudent(new Student("Іван", 20, "ПЗ-21"));
        manager.addStudent(new Student("Марія", 19, "ПЗ-22"));
        manager.addStudent(new Student("Олег", 21, "ПЗ-21"));

        manager.printAllStudents();

        System.out.println("\nВведіть ім'я для пошуку:");
        Student found = manager.findByName(scanner.nextLine());
        if (found != null) found.printInfo();

        System.out.println("\nВведіть групу для пошуку:");
        manager.printByGroup(scanner.nextLine());

        System.out.println("Введіть ім'я, щоб видалити студента: ");
        manager.removeByName(scanner.nextLine());

        manager.printAllStudents();
    }
}

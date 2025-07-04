package week1.service;

import week1.model.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student s : students) {
            s.printInfo();
        }
    }

    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public void printByGroup(String groupName) {
        for (Student s : students) {
            if (s.getGroup().equalsIgnoreCase(groupName)) {
                s.printInfo();
            }
        }
    }

    public void removeByName(String name) {
        students.removeIf(s -> s.getName().equalsIgnoreCase(name));
    }
}

package org.example.lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsList {
    public static List<Student> list = new ArrayList<>();

    public static ArrayList<Student> sortStudents(){
        getStudentsList();
        return StudentsList.list.stream()
                .filter(Student -> Student.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void getStudentsList(){
        for (int i = 0; i <100 ; i++) {
            Student e = new Student(Service.getName(),Service.getSurname(), Service.getAge());
            list.add(e);
        }
    }

}

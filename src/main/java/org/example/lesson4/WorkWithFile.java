package org.example.lesson4;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkWithFile {

    public static List<Student> st = new ArrayList<>();

    public static void input() throws IOException, ClassNotFoundException {
        File studentsList = Path.of("src","main","java", "org", "example","lesson4", "resources", "students.out").toFile();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(studentsList))) {
            while (true) {
                try {
                    Student o = (Student) objectInputStream.readObject();
                    st.add(o);
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }

    public static void output() throws IOException {
        File studentsList = Path.of("src","main","java", "org", "example","lesson4", "resources", "students.out").toFile();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(studentsList))) {
            for (Student s : StudentsList.sortStudents()) {
                objectOutputStream.writeObject(s);
            }
        }
    }
    public static void getNameAndSurname(){
        List<String> strings = st.stream()
                .map(Student -> Student.getName() + " " + Student.getSurname())
                .toList();
        for (String s : strings) {
            System.out.println(s);
        }
    }
}

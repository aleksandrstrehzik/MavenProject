package org.example.lesson4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentsList.sortStudents();
        WorkWithFile.output();
        WorkWithFile.input();
        WorkWithFile.getNameAndSurname();
    }
}

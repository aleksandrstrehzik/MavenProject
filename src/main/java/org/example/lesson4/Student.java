package org.example.lesson4;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Service, Serializable {

    private final Name Name;
    private final Surname Surname;
    private final int Age;

    public Student(Name name, Surname surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        return this.getName() == ((Student) o).getName() && this.getSurname() == ((Student) o).getSurname()
                && this.getAge() == ((Student) o).getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, Age);
    }

    public Name getName() {
        return Name;
    }

    public Surname getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name=" + Name +
                ", Surname=" + Surname +
                ", Age=" + Age +
                '}';
    }

}

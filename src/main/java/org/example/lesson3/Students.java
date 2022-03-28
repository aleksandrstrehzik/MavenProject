package org.example.lesson3;


public class Students {
    public static void main(String[] args) {
        Student s = new Student();
        for (int i = 1; i <= 3 ; i++) {
            s.setType(new Type1());
            s.go();

            s.setType(new Type2());
            s.go();

            s.setType(new Type3());
            s.go();
        }
    }
}

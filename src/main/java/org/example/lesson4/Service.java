package org.example.lesson4;

import java.util.Random;

public interface Service {
    Random random = new Random();


     static Name getName(){
        Name[] names = Name.values();
        return names[random.nextInt(names.length)];
    }
    static Surname getSurname(){
        Surname[] surnames = Surname.values();
        return surnames[random.nextInt(surnames.length)];
    }
    static int getAge(){
         return random.nextInt(15,30);
    }
}

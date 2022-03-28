package org.example.lesson3;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Type2 implements Type {
    private static final String NAME = "2";
    private static final int KOFF = 3;
    RandomGenerator random = new Random();

    @Override
    public void type() {
        int x = random.nextInt(10,100) / 10;
        float talant = x / 10f;
        float razbor = nachalnor / talant * KOFF;
        float praktica = nachalnor / talant * KOFF;
        float obschie = razbor + praktica;
        System.out.println("Cтудент типa " + NAME + " талант " + talant);
        System.out.println("Время на разбор " + razbor +" " + "Время на практическую часть " + praktica);
        System.out.println(" Общее время " + obschie);
    }
}

package org.example.lesson3;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Type3 implements Type{
    public static final String NAME = "3";
    private static final int KOFF = 9;
    RandomGenerator random = new Random();

    @Override
    public void type() {
        int x = random.nextInt(10,100) / 10;
        float talant = x / 10f;
        float razbor =nachalnor / talant * KOFF;
        float obschie = razbor;
        System.out.println("Cтудент типa " + NAME + " талант " + talant);
        System.out.println("Время на разбор " + razbor);
        System.out.println(" Общее время " + obschie);
    }
}

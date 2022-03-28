package org.example.lesson3;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Type1 implements Type{
    private static final String NAME = "1";
    RandomGenerator random = new Random();

    @Override
    public void type() {
            int x = random.nextInt(10,100) / 10;
            float talant = x / 10f;
            float razbor = nachalnor / talant;
            float praktica = nachalnor / talant;
            float potok = nachalnor / talant;
            float obschie = razbor + praktica + potok;
            System.out.println("Cтудент типa " + NAME + " талант " + talant);
            System.out.println("Время на разбор " + razbor + "Время на практическую часть " + praktica);
            System.out.println("Время на нахождение в потоке " + potok + " Общее время " + obschie);
    }
}

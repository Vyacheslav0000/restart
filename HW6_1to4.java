package ru.geerbrains;

import ru.geerbrains.Animal;
import ru.geerbrains.Cat;
import ru.geerbrains.Dog;

import java.util.Random;
public class HW6_1to4 {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", rnd.nextInt(100) + 201, rnd.nextInt(5) + 6);
        cat.run(200);
        cat.swim(1);
        cat.jump(2);

        Animal dog = new Dog ("Барбос", rnd.nextInt(100) + 501, rnd.nextInt(200),rnd.nextInt(5) + 5);
        dog.run(500);
        dog.swim(5);
        dog.jump(0.5);

        Animal dog1 = new Dog ("Шарик", rnd.nextInt(100) + 501, rnd.nextInt(200),rnd.nextInt(5) + 5);
        dog1.run(600);
        dog1.swim(9);
        dog1.jump(0.5);
    }
}
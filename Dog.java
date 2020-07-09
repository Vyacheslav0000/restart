package ru.geerbrains;

import ru.geerbrains.Animal;

public class Dog extends Animal {
//    int runDistance = 500;
    int MAX_SWIM_LENGTH = 10;
//    double jumpHeight = 0.5;

//    public Dog(String name, int runDistance, double jumpHeight, int MAX_SWIM_LENGTH) {
//        super(name, 500, 0.5);
//        this.runDistance = runDistance;
//        this.MAX_SWIM_LENGTH = MAX_SWIM_LENGTH;
//        this.jumpHeight = jumpHeight;
//    }
    public Dog(String name, int max_swim_length, int i, int MAX_SWIM_LENGTH) {
        super(name, 500, 0.5);
        this.MAX_SWIM_LENGTH = MAX_SWIM_LENGTH;
    }
//    public Dog(String name, int runDistance, double jumpHeight, int MAX_SWIM_LENGTH) {
//        super(name, runDistance, jumpHeight);
//        this.runDistance = runDistance;
//        this.MAX_SWIM_LENGTH = MAX_SWIM_LENGTH;
//        this.jumpHeight = jumpHeight;
//    }
}

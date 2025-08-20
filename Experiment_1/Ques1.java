package Experiment_1;

interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    @Override
    public void fly() {
        System.out.println("Bat can fly at night.");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
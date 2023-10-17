package SduPractice;

class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void feedAnimal(double amount) {
        double foodAmount = amount * getFoodFactor();
        System.out.printf("%s the %s ate %.2f grams of food.%n", name, getClass().getSimpleName(), foodAmount);
    }

    protected double getFoodFactor() {
        return 1;
    }
}

class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    protected double getFoodFactor() {
        return 1.0 / 7.0;
    }
}

class Tiger extends Animal {
    public Tiger(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    protected double getFoodFactor() {
        return 1.0 / 5.0;
    }
}

class Bear extends Animal {
    public Bear(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    protected double getFoodFactor() {
        return 1.0 / 10.0;
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    protected double getFoodFactor() {
        return 1.0 / 15.0;
    }
}

public class PA15B {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", 10, 150),
                new Tiger("Rajah", 8, 200),
                new Bear("Baloo", 5, 300),
                new Monkey("Abu", 2, 10)
        };

        for (Animal animal : animals) {
            animal.feedAnimal(10);
        }
    }
}

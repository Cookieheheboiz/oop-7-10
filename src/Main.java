import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<Animal>();
        Duck duck = new Duck("Duck", true, true);
        Pig pig = new Pig("Pig", true, false);
        Fish fish = new Fish("Fish", true, true);
        animal.add(duck);
        animal.add(pig);
        animal.add(fish);
        Animal animal1  = new Animal();
        animal1.print(animal);

    }
}
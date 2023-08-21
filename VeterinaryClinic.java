package seminars;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    private final List<Animal> animals;

    public VeterinaryClinic() {
        this.animals = new ArrayList<>();
    }

    public VeterinaryClinic addNewAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                resultAnimals.add((Flyable) animal);
            }
        }
        return resultAnimals;
    }

    //public List<>
    public List<Swimable> getSwimableAnimals() {
        List<Swimable> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                resultAnimals.add((Swimable) animal);
            }
        }
        return resultAnimals;
    }

    public List<Flyable> getFlyableAnimals() {
        List<Flyable> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                resultAnimals.add((Flyable) animal);
            }
        }
        return resultAnimals;
    }

    public List<Runnable> getRunnableAnimals() {
        List<Runnable> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                resultAnimals.add((Runnable) animal);
            }
        }
        return resultAnimals;
    }
}
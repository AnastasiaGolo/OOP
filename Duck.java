package seminars;

public class Duck extends Animal implements Swimable, Flyable{
    public Duck(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(nameAnimal, ownerName, diagnosis, isVactinated);
    }

    @Override
    public void fly(int speed) {

    }

    @Override
    public void swim(int speed) {

    }
}

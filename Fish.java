package seminars;

public class Fish extends Animal implements Illable, Swimable{
    public Fish(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(nameAnimal, ownerName, diagnosis, isVactinated);
    }

    @Override
    public void swim(int speed) {

    }
}

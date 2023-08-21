package seminars;

public class Dog2 extends Animal implements Soundable, Illable, Runnable{
    public Dog2(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(nameAnimal, ownerName, diagnosis, isVactinated);
    }

    @Override
    public void sound() {
        System.out.println("Gaw");
    }

    @Override
    public void run(int speed) {

    }
}
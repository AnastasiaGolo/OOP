package seminars;

public class Cat2 extends Animal implements Illable, Soundable, Runnable{
    public Cat2(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(nameAnimal, ownerName, diagnosis, isVactinated);
    }

    @Override
    public void sound() {
        System.out.println("Myu");
    }

    @Override
    public void run(int speed) {

    }
}

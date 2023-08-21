package seminars;

public class Pigeon extends Animal implements Flyable{

    public Pigeon() {
    }

    @Override
    public void toGo(){
        System.out.println(" Я голубь и я умею ходить. ");
    }

     @Override
    public void fly(){
        System.out.println(" Я голубь и я умею летать. ");
    }

    @Override
    public void fly(int speed) {

    }
}

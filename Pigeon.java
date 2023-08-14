package seminars;

public class Pigeon extends Animal{
    
    public Pigeon(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(null, null, null, null);
    }

    public Pigeon() {
    }

    @Override
    public void toGo(){
        System.out.println(" Я голубь и я умею ходить. ");
    }

     @Override
    public void swim(){
        System.out.println(" Я голубь и я не умею плавать. ");
    }

     @Override
    public void fly(){
        System.out.println(" Я голубь и я умею летать. ");
    }
}

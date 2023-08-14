package seminars;

public class Duck extends Animal{

    public Duck(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(null, null, null, null);
    }

    public Duck() {
    }

    @Override
    public void toGo(){
        System.out.println(" Я утка и я умею ходить. ");
    }

     @Override
    public void swim(){
        System.out.println(" Я утка и я умею плавать. ");
    }

     @Override
    public void fly(){
        System.out.println(" Я утка и я умею летать. ");
    }
}
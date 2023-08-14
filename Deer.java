package seminars;

public class Deer extends Animal{
    public Deer(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        super(nameAnimal, ownerName, diagnosis, isVactinated);
    }

    public Deer() {
    }

    @Override
    public void toGo(){
        System.out.println(" Я олень и я умею ходить. ");
    }

     @Override
    public void swim(){
        System.out.println(" Я олень и я умею плавать. ");
    }

     @Override
    public void fly(){
        System.out.println(" Я олень и я не умею летать. ");
    }
}

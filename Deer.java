package seminars;

public class Deer extends Animal implements Swimable{
 
   public Deer() {
    }

    @Override
    public void toGo(){
        System.out.println(" Я олень и я умею ходить. ");
    }

     @Override
    public void fly(){
        System.out.println(" Я олень и я не умею летать. ");
    }

    @Override
    public void swim(int speed) {

    }
}

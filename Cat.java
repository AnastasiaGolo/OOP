package seminars;

public class Cat extends Animal {
    private int countPaws;
    public Cat(){
        this("Max", null, null, false, 4);
    }

    public Cat(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated, int countPaws){
            super(nameAnimal, ownerName, diagnosis, isVactinated);
            this.countPaws = countPaws;
        }

    private void wakeUp (){
        System.out.println("Кот проснулся");
    }

    private void findFood (){
        System.out.println("Кот нашел еду");
    }

    private void eat (){
        System.out.println("Кот поел");
    }

    private void sleep (){
        System.out.println("Кот уснул");
    }

    public void hunt(){
        wakeUp();
        findFood();
        eat();
        sleep();
    }
}

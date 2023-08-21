package seminars;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Animal barsic = new Animal("Барсик", "Ольга", "простуда", false);

        System.out.println(barsic.isVactinated());
        barsic.setVactinated(true);
        System.out.println(barsic.isVactinated());
        System.out.println(barsic.getType());
        Cat cat = new Cat();
        System.out.println(cat);

        Cat musya = new Cat();   
        Dog pes = new Dog();
        List <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(barsic);
        animals.add(pes);
        //System.out.println(animals);

        //System.out.println(musya.getType());
        //System.out.println(musya.getType("C arg "));
        
        //cat.hunt();
        Deer deer = new Deer();
        //Animal duck = new Duck();
        Animal pigeon  = new Pigeon();
        
        //duck.toGo();

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addNewAnimal(new Cat2("Tom", "Nikolay", "null", false))
                .addNewAnimal(new Dog2("Rex", "Masha", "null", true))
                .addNewAnimal(new Human("Sasha", "Sasha", "null", false));
        List<Illable> illables= new ArrayList<>();
        illables.add(new Cat2("Tom", "Nikolay", "null", false));

        for (Animal animal: clinic.getAnimals()) {
            animal.ill();
        }
    }
}
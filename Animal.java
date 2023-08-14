// Животное для вет клиники

package seminars;

public class Animal{
    protected String nameAnimal; // кличка животного 
    protected String ownerName; // имя хозяина
    protected String diagnosis; // диагноз
    protected Boolean isVactinated; // Привит или нет
    protected final String TYPE = getClass().getSimpleName();

    public Animal( String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated){
    this.nameAnimal = nameAnimal;
    this.ownerName =  ownerName;
    this.diagnosis = diagnosis;
    this.isVactinated = isVactinated;
    }

    public Animal(){

    }

    public boolean isVactinated(){  //геттер для получения доступа к полю
        return this.isVactinated;
    }

    public void setVactinated(Boolean isVactinated){  //сеттер для изменения поля
        this.isVactinated = isVactinated;
    }

    public String getType(){
        return TYPE;
    }

    @Override
    public String toString (){
        return String.format("%s{name = %s, owner = %s}", TYPE, nameAnimal, ownerName);
    }

    public String getType(String arg){
        return arg + TYPE;
    }

    protected void toGo(){     //Ходить
        System.out.println("Я умею ходить как " +  TYPE);
    }

    protected void fly(){     //Летать
        System.out.println("Я умею летать как " +  TYPE);
    }

    protected void swim(){     //Плавать
        System.out.println("Я умею плавать как " +  TYPE);
    }
}



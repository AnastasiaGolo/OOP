package seminars;

public class Doctor{
    protected String nameDoctor; //имя доктора
    protected String workSchedule; //график работы
    protected String workDuties; //рабочие обязанности


    public Doctor(String nameDoctor, String workSchedule, String workDuties){
        this.nameDoctor = nameDoctor;
        this.workSchedule = workSchedule;
        this.workDuties = workDuties;
    }

    public String getName(){
        return this.nameDoctor;
    }
    public String getworkSchedule(){
        return this.workSchedule;
    }
    public String getworkDuties(){
        return this.workDuties;
    }
}

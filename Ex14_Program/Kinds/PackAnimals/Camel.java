package Kinds.PackAnimals;
import Kinds.PackAnimal;

public class Camel extends PackAnimal {
    public Camel(){
        super();
    }
    public void set(String Name, String Commands, String Birthday) {
        this.capacity = "Good";
        this.endurance = "Very good";
        this.speed = "Average";
        this.name = Name;
        this.commands = Commands;
        this.birthday = Birthday;
    }
    @Override
    public void BaseCommand() {
        System.out.println("Spits: Тьфу");
    }
    @Override
    public String GetOtherInfo(){
        String info = String.format("Name~%s;Commands~%s;Birthday~%s;Capacity~%s;Endurance~%s;Speed~%s",
                name, commands, birthday, capacity, endurance, speed);
        return info;
    }
    @Override
    public void GetInfo(){
        String info = String.format("""
                        Name: %s
                        Commands: %s
                        Birthday: %s
                        Capacity: %s
                        Endurance: %s
                        Speed: %s
                        """,
                name, commands, birthday, capacity, endurance, speed);
        System.out.println(info);
    }
}
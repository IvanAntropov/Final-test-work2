package Kinds.PackAnimals;
import Kinds.PackAnimal;

public class Donkey extends PackAnimal {
    public Donkey(String Name, String Commands, String Birthday){
        super();
        this.capacity = "Average";
        this.endurance = "Average";
        this.speed = "Slow";
        this.name = Name;
        this.commands = Commands;
        this.birthday = Birthday;
    }

    @Override
    public void BaseCommand() {
        System.out.println("Makes a sound: Иии-ааа иии-ааа");
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
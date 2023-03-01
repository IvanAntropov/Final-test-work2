package Kinds.PackAnimals;
import Kinds.PackAnimal;

public class Horse extends PackAnimal {
    public Horse(String Name, String Commands, String Birthday){
        super();
        this.capacity = "Good";
        this.endurance = "Good";
        this.speed = "Very good";
        this.name = Name;
        this.commands = Commands;
        this.birthday = Birthday;
    }

    @Override
    public void BaseCommand() {
        System.out.println("Makes a sound: Иии-го-го");
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
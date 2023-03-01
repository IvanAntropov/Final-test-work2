package Kinds.PackAnimals;
import Kinds.PackAnimal;
public class Horse extends PackAnimal {
    public Horse(){
        super();
    }
    public void set(String Name, String Commands, String Birthday) {
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
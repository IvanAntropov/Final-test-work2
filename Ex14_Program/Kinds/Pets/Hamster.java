package Kinds.Pets;
import Kinds.Pet;

public class Hamster extends Pet {
    public Hamster(String Name, String Commands, String Birthday){
        super();
        this.obedience = "Is missing";
        this.autonomy = "Its can't survive without you";
        this.foodHabits = "Herbivorous";
        this.name = Name;
        this.commands = Commands;
        this.birthday = Birthday;
    }

    @Override
    public void BaseCommand() {
        System.out.println("Chewing: Ням-ням-ням");
    }

    @Override
    public void GetInfo(){
        String info = String.format("""
                        Name: %s
                        Commands: %s
                        Birthday: %s
                        Obedience: %s
                        Autonomy: %s
                        Food habits: %s
                        """,
                name, commands, birthday, obedience, autonomy , foodHabits);
        System.out.println(info);
    }
}
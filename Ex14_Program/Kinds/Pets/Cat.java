package Kinds.Pets;
import Kinds.Pet;
public class Cat extends Pet {
    public Cat(){
        super();
    }
    public void set(String Name, String Commands, String Birthday) {
        this.obedience = "Average";
        this.autonomy = "Full";
        this.foodHabits = "Carnivorous";
        this.name = Name;
        this.commands = Commands;
        this.birthday = Birthday;
    }
    @Override
    public void BaseCommand() {
        System.out.println("Makes a sound: Мяяууу");
    }

    @Override
    public String GetOtherInfo(){
        String info = String.format("Name~%s;Commands~%s;Birthday~%s;Obedience~%s;Autonomy~%s;Food habits~%s;",
                name, commands, birthday, obedience, autonomy , foodHabits);
        return info;
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
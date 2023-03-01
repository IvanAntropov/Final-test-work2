
class CatClass extends PetClass {
    public CatClass(String Name, String Commands, String Birthday){
        super();
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
}
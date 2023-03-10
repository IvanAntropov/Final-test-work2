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

    @Override
    public void GetInfo(){
        String info = String.format("Name: %s\n" +
                "Commands: %s\n" +
                "Birthday: %s\n" +
                "Obedience: %s\n" +
                "Autonomy: %s\n" +
                "Food habits: %s\n",
                name, commands, birthday, obedience, autonomy , foodHabits);
        System.out.println(info);
    }
}
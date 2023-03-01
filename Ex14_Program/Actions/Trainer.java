package Actions;

import Actions.Base.Action;
import Animals.Animal;
import Console.Reader;

public class Trainer extends Action {
    public Animal whichAnimal(){
        Animal animal = null;
        return animal;
    }
    public boolean training(Animal animal){
        if(animal == null){
            return true;
        }
        Reader reader = new Reader("Чему научим?\n" +
                "Enter: ", "Проверьте данные и попробуйте снова");
        animal.commands += reader.read();
        return true;
    }
    @Override
    public boolean action() {
        return training(whichAnimal());
    }
}
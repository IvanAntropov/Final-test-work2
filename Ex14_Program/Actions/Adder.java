package Actions;

import Actions.Base.Action;
import Animals.Animal;
import Console.Reader;
import Counter.Counter;
import Data.Zoo;
import Kinds.PackAnimals.Camel;
import Kinds.PackAnimals.Donkey;
import Kinds.PackAnimals.Horse;
import Kinds.Pets.Cat;
import Kinds.Pets.Dog;
import Kinds.Pets.Hamster;
public class Adder extends Action {
    Animal[] arrayOfAnimals = new Animal[]{null, new Cat(), new Dog(), new Hamster(),
                                        new Horse(), new Donkey(), new Camel()};
    public Animal whichAnimal(){
        Reader reader = new Reader("Какое животное?\n 1) Кот\n 2) Собака\n 3) Хомяк\n 4) Лошадь\n 5) Осел\n 6) Верблюд\n 0) Назад \nEnter: ", "Такого зверя нет!");
        return arrayOfAnimals[reader.readInt(0,6)];
    }
    public boolean add(Animal animal){
        if(animal == null){
            return true;
        }
        boolean check = true;
        while(check){
            Reader reader = new Reader("Введите имя;команды;день рождение животного через точку с запятой! \n Пример: Вася;Воровать;29.03.2012", "Проверьте данные и попробуйте" +
                    " снова");
            String[] animalSet = reader.read().split(";");
            try {
                if (animalSet.length == 3) {
                    animal.set(animalSet[0], animalSet[1], animalSet[2]);
                    check = false;
                }
                Counter.add(check);
            }catch(RuntimeException re){
                System.out.println(re);
            }
        }
        Zoo.add(animal);
        return true;
    }
    @Override
    public boolean action() {
        return add(whichAnimal());
    }
}
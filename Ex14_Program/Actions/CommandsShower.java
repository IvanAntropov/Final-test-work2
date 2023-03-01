package Actions;

import Actions.Base.Action;
import Animals.Animal;
import Console.Reader;
import Counter.Counter;
import Data.Zoo;

public class CommandsShower extends Action {
    public boolean getInfo(){
        Zoo.print();
        Reader reader = new Reader("""
                                      Какого? Введите индекс
                                      """, "Такого индекса нет!!!");
        int chosen = reader.readInt(0,Counter.getCount());
        if(chosen == 0){
            return true;
        }
        Zoo.printByIndex(chosen,"Commands");
        return true;
    }

    @Override
    public boolean action() {
        return getInfo();
    }
}
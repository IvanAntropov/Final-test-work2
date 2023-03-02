package Actions;

import Actions.Base.Action;
import Console.Reader;
import Counter.Counter;
import Data.Zoo;
public class Trainer extends Action {
    public void addCommand(int chosen, String commandStr){
        Zoo.changeByIndex(chosen, "Commands",commandStr);
    }
    public boolean training(){
        Zoo.print();
        Reader reader = new Reader("""
                                      Кого будем учить? Введите индекс.
                                      0) Назад
                                      """, "Такого индекса нет!!!");
        int chosen = reader.readInt(0, Counter.getCount());
        if(chosen == 0){
            return true;
        }
        Reader readerStr = new Reader("""
                                      Чему будем учить? Введите команду/ы.
                                      0) Назад
                                      """, "Проверьте данные и попробуйте снова.");
        String commandStr = readerStr.read();
        if(commandStr.equals("0")){
            return true;
        }
        addCommand(chosen, commandStr);
        Zoo.printByIndex(chosen,"Commands");
        return true;
    }
    @Override
    public boolean action() {
        return training();
    }
}
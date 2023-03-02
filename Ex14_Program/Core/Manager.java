package Core;

import Actions.Adder;
import Actions.Base.Action;
import Actions.CommandsShower;
import Actions.Trainer;
import Console.Reader;
public class Manager {
    public Manager(){
    }
    Action[] arrayOfActions = new Action[]{new Action(), new Adder(), new CommandsShower(), new Trainer()};
    String[] array = new String[]{"""
                        Что вы хотите сделать?
                        1) Добавить животное
                        2) Показать команды животного
                        3) Научить животное новым командам
                        0) Выйти
                        \s""","\nДо свидания!\n"};
    Reader reader = new Reader(array[0], "Такого варианта нет, попробуй снова.");
    public void Start(){
        boolean check = true;
        while (check) {
            int chosen;
            chosen = reader.readInt(0, 3);
            Action chosenAction = arrayOfActions[chosen];
            if (!chosenAction.action()) {
                check = false;
                System.out.println(array[1]);
            }
        }
    }
}
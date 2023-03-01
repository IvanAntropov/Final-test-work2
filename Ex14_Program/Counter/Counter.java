//15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
//        значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое
//        животное” Сделайте так, чтобы с объектом такого типа можно было работать в
//        блоке try-with-resources. Нужно бросить исключение, если работа с объектом
//        типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
//        считать в ресурсе try, если при заведении животного заполнены все поля.

package Counter;

public class Counter {
    static int count = 0;
    public static void add(boolean check){
        if(check){
            throw new RuntimeException("Count doesn't work");
        }else{
            count++;
        }
    }
    public static int getCount(){
        return count;
    }
}





package Data;

import Animals.Animal;
import Counter.Counter;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
//    static Map<String,HashMap<String,String>> zoo = new HashMap<String,HashMap<String,String>>();
    static Map<Integer, HashMap<String, String>> zoo2 = new HashMap<Integer, HashMap<String, String>>();
    public static void add(Animal animal){
        String[] arrayFirst = animal.GetOtherInfo().split(";");
        HashMap<String,String> mapToAdd = new HashMap<String,String>();
        for (String s : arrayFirst) {
            String[] arraySecond = s.split("~");
            mapToAdd.put(arraySecond[0], arraySecond[1]);
        }
//        zoo.put(animal.name, mapToAdd);
        zoo2.put(Counter.getCount(), mapToAdd);
    }

//    public static void print2(){
//        char[] array = zoo2.toString().toCharArray();
//        for(char s : array){
//            if((s+"").equals("{")){
//                System.out.printf("");
//            } else if ((s+"").equals("}")) {
//                System.out.printf("\n");
//            } else if ((s+"").equals("=")) {
//                System.out.printf(": ");
//            } else {
//                System.out.printf(s + "");
//            }
//        }
//    }

    public static void print(){
        for(int i = 1; i <= Counter.getCount(); i++){
            System.out.println(i + ": " + zoo2.get(i).get("Name"));
        }
    }
    public static void printByIndex(int index, String key){
        System.out.println(zoo2.get(index).get(key));
    }
}
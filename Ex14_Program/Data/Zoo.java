package Data;

import Animals.Animal;
import Counter.Counter;
import java.util.HashMap;
import java.util.Map;
public class Zoo {
    static Map<Integer, HashMap<String, String>> zoo2 = new HashMap<Integer, HashMap<String, String>>();
    public static void add(Animal animal){
        String[] arrayFirst = animal.GetOtherInfo().split(";");
        HashMap<String,String> mapToAdd = new HashMap<String,String>();
        for (String s : arrayFirst) {
            String[] arraySecond = s.split("~");
            mapToAdd.put(arraySecond[0], arraySecond[1]);
        }
        zoo2.put(Counter.getCount(), mapToAdd);
    }
    public static void print(){
        for(int i = 1; i <= Counter.getCount(); i++){
            System.out.println(i + ": " + zoo2.get(i).get("Name"));
        }
    }
    public static void printByIndex(int index, String key){
        System.out.println("\n" + key + ": " + zoo2.get(index).get(key) + "\n");
    }

    public static void changeByIndex(int index, String key, String str) {
        String strToPut = zoo2.get(index).get(key) + ", " + str;
        zoo2.get(index).put(key, strToPut);
    }
}
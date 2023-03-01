package Console;

import java.util.Scanner;

public class Reader {
    String text1;
    String text2;
    Scanner in = new Scanner(System.in);

    public Reader() {
        this.text1 = "\nSuccess!\n\n";
        this.text2 = "\nTry again.\n";
    }

    public Reader(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public String read(){
        String ConsoleString = "";
        boolean check = true;
        while(check) {
            if (in.hasNextLine()) {
                ConsoleString = in.nextLine();
                check = false;
            } else {
                System.out.println(text2);
            }
        }
//        in.close();
        return ConsoleString;
    }

    public int readInt(int min,int max){
        int ConsoleInt = 0;
        boolean check = true;
        System.out.printf(text1);
        while(check) {
            if (in.hasNextInt()) {
                ConsoleInt = in.nextInt();
                if(ConsoleInt>=min && ConsoleInt<=max) {
                    check = false;
                } else {
                    System.out.printf(text2);
                }
            } else {
                System.out.print("Введите число!!!");
            }
        }
//        in.close();
        return ConsoleInt;
    }

}
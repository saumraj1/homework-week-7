package homeworkweek7;
/*
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet
 * should be invalid entry
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = in.next().charAt(0);
        ArrayList<String> list = new ArrayList<String>();
        //   ArrayList<String> list2=new ArrayList<String>();
        list.add("Ahemdabad");
        list.add("Bhuvneswar");
        list.add("chandigadh");
        list.add("diu");
        list.add("England");
        list.add("Faridabad");


        if( 'a'==c)
        {
            System.out.println(list.get(0));
        }else if( 'b'==c)
        {
            System.out.println(list.get(1));
        }else if( 'c'==c)
        {
            System.out.println(list.get(2));
        }else if( 'd'==c)
        {
            System.out.println(list.get(3));
        }else if( 'e'==c)
        {
            System.out.println(list.get(4));
        }else if( 'f'==c)
        {
            System.out.println(list.get(5));
        }else
        {
            System.out.println("invalid");
        }


    }


}

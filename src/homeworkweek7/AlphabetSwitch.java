package homeworkweek7;

import java.util.ArrayList;
import java.util.Scanner;

/*9. Same as above program-8 using switch statement.
 */
public class AlphabetSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = in.next().charAt(0);
        ArrayList<String> list = new ArrayList<String>();
        //   ArrayList<String> list2=new ArrayList<String>();
        list.add("Abu");
        list.add("Bharuch");
        list.add("canada");
        list.add("diu");
        list.add("England");
        list.add("Feldham");


        switch(ch)
        {
            case 'a':
                System.out.println(list.get(0));
                break;
            case 'b':
                System.out.println(list.get(1));
                break;
            case 'c':
                System.out.println(list.get(2));
                break;
            case 'd':
                System.out.println(list.get(3));
                break;
            case 'e':
                System.out.println(list.get(4));
                break;
            case 'f':
                System.out.println(list.get(5));
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}

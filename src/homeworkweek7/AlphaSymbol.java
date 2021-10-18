package homeworkweek7;

import java.util.Scanner;

/*12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class AlphaSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char chr = sc.next().charAt(0);

        if((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {

            System.out.println(chr + " is A ALPHABET.");

        } else if(chr >= '0' && chr <= '9') {

            System.out.println(chr + " is A NUMBER.");

        } else {

            System.out.println(chr + " is A SPECIAL CHARACTER.");
        }
    }

}

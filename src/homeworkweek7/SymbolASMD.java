package homeworkweek7;
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */
import java.util.Scanner;

public class SymbolASMD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a, b;
        System.out.print("select any operator:+,-,*,/\n");
        System.out.print("Enter any operator: ");
        char chr;
        chr =sc.next().charAt(0);

        System.out.print("Enter value of a: ");
        a=sc.nextInt();
        System.out.print("Enter value of b: ");
        b=sc.nextInt();
        if(chr == '+')
        {

            System.out.println("Sum is : "+(a + b));
        }
        else if(chr == '-')
        {

            System.out.println("Subtraction is : "+(a - b));
        }
        else if(chr == '*')
        {

            System.out.println("Multiplication is : "+(a * b));
        }
        else if(chr == '/')
        {

            System.out.println("Division is : "+(a / b));
        }
        else
        {
            System.out.println("Cannot recognize the operator!cannot initialize value");
        }

    }
}

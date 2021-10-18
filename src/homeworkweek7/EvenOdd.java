package homeworkweek7;

import java.util.Scanner;
/*
*1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
* */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Input Number");
        int a=obj.nextInt();
        // tenary operator to check the number
        String answer=a % 2 ==0 ? "Even" : "odd";
        System.out.println(a+ "  is  " + answer);
        obj.close();

    }
}

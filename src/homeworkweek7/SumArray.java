package homeworkweek7;
/*
* 18. Write a Java program to sum values of an array.
**/
public class SumArray {
    public static void main(String[] args) {
        int sumarray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : sumarray)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

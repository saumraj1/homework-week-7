package homeworkweek7;
/*
 * 17. Write a Java program to sort a numeric array and a string array.
 * */
import java.util.Arrays;

public class NumericArray {
    public static void main(String[] args){

        int[] myArray1 = {
                20,55,14,34,18,5,788,59,37,66,77,223,2,0,363};

        String[] myArray2 = {
                "Laxmi",
                "Rinka",
                "Dipal",
                "bijal",
                "manisha",
                "dhara"
        };
        System.out.println("Original numeric array : "+ Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array : "+Arrays.toString(myArray1));

        System.out.println("Original string array : "+Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Sorted string array : "+Arrays.toString(myArray2));
    }
}

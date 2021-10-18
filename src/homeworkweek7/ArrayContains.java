package homeworkweek7;
/*
 *20. Write a Java program to test if an array contains a specific value.
 *
 * */
public class ArrayContains {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] myarray = {
                1,20,12,555,663,32,78,22,66,89,10};
        System.out.println(contains(myarray, 555));
        System.out.println(contains(myarray, 256));
    }
}

package homeworkweek7;
/*
 *19. Write a Java program to calculate the average value of array elements.
 *
 * */
public class CalculateAverageArray {
    public static void main(String[] args) {

        int[] number = new int[]{40, 90, 35, 55, -18, 80, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < number.length ; i++)
            sum = sum + number[i];
        //calculate average value
        double average = sum / number.length;
        System.out.println("Average value of the array elements is : " + average);
    }

}

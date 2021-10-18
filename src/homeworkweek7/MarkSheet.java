package homeworkweek7;

import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        System.out.println("Enter Roll No");
        int rn=sc.nextInt();
        System.out.println("Enter Marks: Maths");
        int mt=sc.nextInt();
        if (mt<0 || mt>100)
            System.out.println(" Invalid Input Marks should between 0 to 100");
        System.out.println("Enter Marks:Science");
        int sci=sc.nextInt();
        if (sci<0 || sci>100)
            System.out.println(" Invalid Input Marks should between 0 to 100");
        System.out.println("Enter Marks:English");
        int eng=sc.nextInt();
            if (eng<0 || eng>100)
                System.out.println(" Invalid Input Marks should between 0 to 100");
        int total=mt+sci+eng;
        float per=total/3f;
        System.out.println("________________________________________");
        System.out.println("| |");
        System.out.println("| Mark Sheet|");
        System.out.println("|_______________________________________|");
        System.out.println("|Name:" +name+ "|");
        System.out.println("|Roll No:" +rn+ "|");
        System.out.println("|_______________________________________|");
        System.out.println("|Subjects: Marks |");
        System.out.println("|_______________________________________|");
        System.out.println("|Maths: "+mt+ " |");
        System.out.println("|Science: "+sci+ " |");
        System.out.println("|English: "+eng+ " |");
        System.out.println("|_______________________________________|");
        System.out.println("|Total: "+total+ " |");
        System.out.println("|_______________________________________|");
        System.out.println("|Percentage: " +per+ "%|");
       if (per>=35 && per<=100 )
           System.out.println("|Result: Pass |");
       else
            System.out.println("|Result: Fail |");
        if (per>=80 && per<=100 )
            System.out.println("|Grade:  A+|");
        if (per>=60 && per<80 )
            System.out.println("|Grade:  A|");
        if (per>=50 && per<60 )
            System.out.println("|Grade:  B|");
        if (per>=35 && per<50 )
            System.out.println("|Grade:  C|");
        System.out.println("|_______________________________________|");
    }
}

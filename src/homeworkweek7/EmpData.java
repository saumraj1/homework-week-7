package homeworkweek7;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross
salary = basic salary + HRA + TA + DA –PF Print in following format
 */
import java.util.Scanner;

public class EmpData {
    public static void main(String args[]) {
        // double empid,empname;
        //String empname="Jay";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id:");
        double emid=sc.nextDouble();
        System.out.print("Enter Employee Name: ");
        String  emname=sc.next();

        System.out.print("Enter Basic Salary:");
        double embs = sc.nextDouble();

        double emhra = 0.10 * embs;
        double emta  = 0.09 * embs;
        double emda = 0.08 * embs;
        double empf = 0.20 * embs;

        double gs = embs + emda + emta+emhra;
        double gs1=gs-empf;

        System.out.println("|----------------------------------\t|");
        System.out.println("|           Salary Slip            \t|");
        System.out.println("|----------------------------------\t|");
        System.out.println("| Employee Id       : "+emid+"    \t|");
        System.out.println("| Employee Name     : "+emname+"  \t\t\t|");
        System.out.println("|----------------------------------\t|");
        System.out.println("| Basic Salary      : "+embs+"       |");
        System.out.println("| HRA               : "+emhra+"      \t|");
        System.out.println("| TA                : "+emta+"       |");
        System.out.println("| DA                : "+emda+"       |");
        System.out.println("| PF                : "+empf+"        |");
        System.out.println("|----------------------------------\t|");
        System.out.println("| Gross Salary      : "+gs1+"       |");
        System.out.println("|==================================\t|");


    }


}


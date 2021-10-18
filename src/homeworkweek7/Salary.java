package homeworkweek7;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;
/*
* 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5%
* */
public class Salary {
    double Sales_amount, CommissionRate;
    double Commission;

    public static void main(String[] args) {
     // Auto-generated method stub
        Scanner Read = new Scanner(System.in);
        Salary sl = new Salary();
        sl.CommissionRate = 0.0;
        System.out.println("please enter Total Sales ");
        sl.Sales_amount = Read.nextDouble();

        if (sl.Sales_amount >= 50000) {
            sl.CommissionRate = 0.35;
        } else if (sl.Sales_amount >= 30000 && sl.Sales_amount < 50000) {
            sl.CommissionRate = 0.20;
        } else if (sl.Sales_amount >= 20000 && sl.Sales_amount < 30000) {
            sl.CommissionRate = 0.10;
        } else if (sl.Sales_amount >= 10000 && sl.Sales_amount < 20000) {
            sl.CommissionRate = 0.05;
        } else if (sl.Sales_amount < 10000) {
            sl.CommissionRate = 0.02;
        }
    }
}
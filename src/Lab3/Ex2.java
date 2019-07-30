package Lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
     double x ;
        Scanner sc = new Scanner(System.in);

        System.out.println("กรุณากรอกคะแนนของคุณ:  ");

        x =sc.nextDouble();

        if (x<=49.99)
            System.out.println("คุณได้เกรด F ");

        else if (x<=54.99) {
            System.out.println("คุณได้เกรด D ");
        } else if (x<=59.99)
            System.out.println("คุณได้เกรด D+ ");
        else if (x<=64.99)
            System.out.println("คุณได้เกรด C");
        else if (x<=69.99)
            System.out.println("คุณได้เกรด C+");
        else if (x<=74.99)
            System.out.println("คุณได้เกรด B ");
        else if (x<=79.99)
            System.out.println("คุณได้เกรด B+ ");
        else if (x>=80)
            System.out.println("คุณได้เกรด A ");


        else
            System.out.println("กรุณากรอกใหม่");





    }//main

}//class

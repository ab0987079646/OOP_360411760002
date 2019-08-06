package Lab4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x , y ;
        double i,j;

        System.out.println("Enter integer 1 ");
        x  = sc.nextInt();
        System.out.println("Enter integer 1 ");
        y  = sc.nextInt();

        int max = Max (x,y);

        System.out.print("enter real number 1" );
        i = sc.nextDouble();

        System.out.print("enter real number 2" );
        j = sc.nextDouble();

        double max2 = Max(i,j);
        System.out.println("Tne maximum value is " + max);
        System.out.println("Tne maximum value is " + max2);






    }//main

    private static double Max(double i, double j) {

        return i > j   ? i:j;
    }


    private static int Max(int x, int y) {
        return x > y   ? x:y;
}


}//class

package Lab4;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int x , y ;

        System.out.println("Enter integer 1 ");
        x  = sc.nextInt();
        System.out.println("Enter integer 1 ");
        y  = sc.nextInt();


     int max = Max (x,y);

     int max2 = Max2( x, y);

     int min = Min (x,y);
     System.out.println("Tne maximum value is " + max);
     System.out.println("Tne maximum value is " + max2);
     System.out.println("The min " + min);


    }
//3.141
    private static int Min(int x, int y) {

        return x < y ? x :y ;
    }

    private static int Max2(int x, int y) {

        return x > y ? x :y ;
    }

    private static int Max(int x, int y) {

        int resuit ;

        if (x>y) resuit = x ;
        else resuit = y ;
        return resuit;

    }
}//class

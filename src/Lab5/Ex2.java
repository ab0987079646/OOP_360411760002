package Lab5;

import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {

        int num [] = new int[5];

        //input

        num = inputdata (num);

        //output
        printdata (num);

        //หาค่าผลรวม

        abc (num);

    }//main

    private static void abc(int[] num) {
        int total=0;
        for (int x: num ) {

            total +=x ;

        }

        System.out.print("total  "+total);
        System.out.print("Average:  "+total/num.length);
    }


    private static void printdata(int[] num) {
System.out.print("data in array:  ");

        for (int val: num  ) { System.out.print(val+  " ");

        }
    }

    private static int[] inputdata(int[] num) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <num.length ; i++) {
            System.out.print("Enter integer");

            num [i] = sc.nextInt();

        }

        return num;
    }
}//class


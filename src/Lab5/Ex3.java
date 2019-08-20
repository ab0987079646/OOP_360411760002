package Lab5;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        int num [][] = new int[2][3];

        num [0][0] = 100 ;

        System.out.println(num [0][0]);
        System.out.println(num );

        //inputdata

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {   //row

            for (int j = 0; j < num[i].length; j++) {//colum

                System.out.print("enter nun["+i+"]["+j+"]: ");
                num[i][j] = sc.nextInt();





            }

        }

        //display data

        System.out.println("data in array: " );

        for (int i = 0; i < num .length; i++) {
            for (int j = 0; j < num.length; j++) {

                System.out.print(num[i][j]+ "\t");

            }

        }


    }//main

}//class

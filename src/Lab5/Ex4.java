package Lab5;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int num [][] = new int[2][3];
        input (num);
        output (num);

        average (num);
        max (num);
        min (num);




    }//main

    private static void min(int[][] num) {

        int min=num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                if (min > num [i][j])
                    min = num[i][j];


            }

        }

        System.out.print("max: "+min);


    }

    private static void max(int[][] num) {


        int max=num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                if (max < num [i][j])
                max = num[i][j];


            }

        }

        System.out.print("max: "+max);
    }



    private static void average(int[][] num) {

        int total =0;
        int cout=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                total+=num[i][j];
                cout++;




            }

        }


        System.out.print("Average:  "+total/cout);






    }

    private static void output(int[][] num) {

        System.out.println("data in array: " );

        for (int i = 0; i < num .length; i++) {
            for (int j = 0; j < num.length; j++) {

                System.out.print(num[i][j]+ "\t");

            }

        }


    }

    private static void input(int[][] num) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {   //row

            for (int j = 0; j < num[i].length; j++) {//colum

                System.out.print("enter nun["+i+"]["+j+"]: ");
                num[i][j] = sc.nextInt();





            }

        }

    }





}//class

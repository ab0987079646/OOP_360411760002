package Lab3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0 ;
        int avg;

        for (int i = 0; i <10 ; i++) {

            System.out.print("Enter integers" + (i+1)+ ": ");
            total += sc.nextInt();

        }

        System.out.print("total value: "+total);
        System.out.print("Average value: "+total/10);


    }///main
}//class

package Lab3;

import java.util.Scanner;

public class Ex5 {


    public static void main(String[] args) {


        int total = 0 ;
        int input = 0 ;

        int x = 0 ;

        Scanner sc = new Scanner(System.in);

        do {


            System.out.print("entter integers  ");
            input = sc.nextInt();
            if (input >= 0)
                total += input;
               x++;

        } while (input >=0);


        System.out.print("total: "+total);
        System.out.print("Average value: "+total/x);


    }//main
}//   class

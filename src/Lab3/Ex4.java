package Lab3;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        int total = 0 ;
        int input = 0 ;

        Scanner sc = new Scanner(System.in);

        while (input >= 0) {
            System.out.print("entter integers  ");
            input = sc.nextInt();
            if (input >= 0)
                total += input;

            else break;
        }


        System.out.print("total: "+total);
    }//mains
}//calss

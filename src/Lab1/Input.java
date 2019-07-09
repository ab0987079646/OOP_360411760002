package Lab1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("what a you name: ");
        String name = scanner.nextLine();

        System.out.println(name);

        System.out .println("กรุณากรอกอายุ: ");
        int o = scanner.nextInt();
        System.out.print(o);


        System.out.println("กรุณากรอก อีเมล: ");
        String r = scanner1.nextLine();
        System.out.print(r);





    }//main
}//class

package Leb7;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      System.out.println("carbrand  ");
      String a = sc.nextLine();

        System.out.println("carcolor  ");
        String b = sc.nextLine();

        System.out.println("carengine   ");
        String c = sc.nextLine();


        System.out.println("maxspeed  ");
        String d = sc.nextLine();


        System.out.println("countryoforigin ");
        String e = sc.nextLine();




          Supercar car1 = new  Supercar (a,b,c,d,e);
          car1.getsupercarinfo();







    }







}//class

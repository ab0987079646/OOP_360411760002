package Lab4;

import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        double r ;

        System.out.println ("กรอกค่า รัศมีของพื้นที่วงกลม" );
        r = sc.nextDouble();

        double  ci = Ci (r);
        double ai = ai (r);
        double vi = vi (r);

        System.out.println("ค่า รัศมี" +ci);
        System.out.println("ค่า พื้นที่" + ai);
        System.out.println("ค่า ปริมาตร" + ai);





    }//main

    private static double vi(double r) {
        double pi = 3.141 ;
        return (4/3*pi*r*r*r);
    }

    private static double ai(double r) {
        double pi = 3.141 ;
        return  (2*r*r);
    }

    private static double Ci(double r) {
        double pi = 3.141 ;


        return  (2*pi*r);
    }


}//class

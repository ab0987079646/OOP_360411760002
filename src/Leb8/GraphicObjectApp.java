package Leb8;

import java.util.Scanner;

public class GraphicObjectApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter r : ");
        double r = sc.nextDouble();

        Graphicobject O1 =new Circle(r);

        O1.findarea();
        System.out.println(O1.area);






    }
}

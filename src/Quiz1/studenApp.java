package Quiz1;

import java.util.Scanner;

public class studenApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in );

        System.out.print("กรุณากรอกชื่อ:  ");
        String a = sc.nextLine();
        System.out.print("กรุณากรอก ID: ");
        String b = sc.nextLine();
        System.out.print("กรุณากรอกสาขา: ");
        String c = sc.nextLine();

        System.out.print("กรุณากรอกเกรดวิชา A : ");
        String s1 =sc.nextLine();
        double g1 = 0.00;
        if (s1 .equals("a")){
            g1 = 4.00;
        }else if (s1 .equals("b+") ){
             g1 = 3.5;}
        else if (s1 .equals("b")){
             g1 = 3.00;}
        else if (s1 .equals("c+")){
             g1 = 2.5;}
        else if (s1 .equals("c+")){
             g1 = 2.00;}
        else if (s1 .equals("d+")){
             g1 = 1.5;}
        else if (s1 .equals("d+")){
             g1 = 1;}
        else if (s1 .equals("f")){
             g1 = 0.00;}

        else System.out.print("0.00");


        System.out.print("กรุณากรอกเกรดวิชา B : ");
        String s2 =sc.nextLine();
        double g2 = 0.00;
        if (s2 .equals("a")){
            g2 = 4.00;
        }else if (s2 .equals("b+") ){
            g2 = 3.5;}
        else if (s2 .equals("b")){
            g2 = 3.00;}
        else if (s2 .equals("c+")){
            g2 = 2.5;}
        else if (s2 .equals("c+")){
            g2 = 2.00;}
        else if (s2 .equals("d+")){
            g2 = 1.5;}
        else if (s2 .equals("d+")){
            g2 = 1;}
        else if (s2 .equals("f")){
            g2 = 0.00;}

        else System.out.print("0.00");


        System.out.print("กรุณากรอกเกรดวิชา C : ");
        String s3 =sc.nextLine();
        double g3 = 0.00;
        if (s3 .equals("a")){
            g3= 4.00;
        }else if (s3 .equals("b+") ){
            g3 = 3.5;}
        else if (s3 .equals("b")){
            g3 = 3.00;}
        else if (s3 .equals("c+")){
            g3 = 2.5;}
        else if (s3 .equals("c+")){
            g3 = 2.00;}
        else if (s3 .equals("d+")){
            g3 = 1.5;}
        else if (s3 .equals("d+")){
            g3 = 1;}
        else if (s3 .equals("f")){
            g3 = 0.00;}

        else System.out.print("0.00");
        double gpa = (g1+g2+g3)/3;

      Quiz1 stu1 = new Quiz1(a,b,c,gpa);
        System.out.print(stu1.showgpa());














    }//main





}//class

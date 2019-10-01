package Leb8;

public class Circle extends Graphicobject {

    private  double r ;

    static  double pt = 3.141 ;

    public  Circle () {}
    public Circle (double r) {
        this.r = r;
    }


    @Override
    void findarea() {

        super.area = pt*(r*r);

        System.out.println("the area of circle: "+ super.area);

    }


public double getR () {

        return  r;
}



}




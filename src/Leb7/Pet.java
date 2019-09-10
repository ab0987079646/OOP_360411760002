package Leb7;

public class Pet {


    private String ownerName;

    private   String perName ;

    private   int perAge ;

    //constructor
    public Pet (){}

    public Pet (String ownerName ,String perName , int perAge) {

        this.ownerName = ownerName;
        this.perName = perName;
        this.perAge = perAge;


    }




    //getter and setter

    public  String getOwnerName(){

        return this.ownerName  ;

    }


    public void  setOwnerName (String newOwnername) {

        this.ownerName = newOwnername ;

    }






    public  String getPerName(){

        return this.perName ;

    }


    public void  setPerName (String setPerName) {

        this.perName = perName;

    }


    public  int  getPerAge(){

        return this.perAge ;

    }


    public void  setPerAge (int perAge ) {

        this.perAge  = perAge ;

    }


}//class

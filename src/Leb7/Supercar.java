package Leb7;

public class Supercar {

    private String carbrand ;
    private String carcolor ;
    private String carengine ;
    private String maxspeed;
    private String countryoforigin;

    public Supercar  (String carbrand ,String carcolor, String carengine ,String maxspeed ,String countryoforigin) {

        this.carbrand=carbrand;
       this.carcolor = carcolor;
       this.carengine=carengine;
       this.maxspeed=maxspeed;
       this.countryoforigin = countryoforigin;
    }


    //getter and setter

    public  String getcarbrand(){

        return this.carbrand ;
    }
    public void  setcarbrand(String carbrand) {

        this.carbrand = carbrand ;
    }

    public  String getcarcolor(){

        return this.carcolor ;
    }
    public void  setcarcolor(String carcolor) {

        this.carbrand = carcolor ;
    }


    public  String getcarengine(){

        return this.carengine ;
    }
    public void  setcarengine(String carengine) {

        this.carbrand = carengine ;
    }



    public  String getmaxspeed(){

        return this.maxspeed ;
    }
    public void  setmaxspeed(String maxspeed) {

        this.maxspeed = maxspeed;
    }



    public  String gecountryoforigin(){

        return this. countryoforigin ;
    }
    public void  setcountryoforigin(String  countryoforigin) {

        this.countryoforigin =  countryoforigin;
    }




      public  void getsupercarinfo () {
          System.out.println(carbrand +
                  carcolor +
                  carengine +
                  maxspeed+
                  countryoforigin);

      }








}//class

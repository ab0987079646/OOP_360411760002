package Leb7;

public class PetApp {

    public static void main(String[] args) {
    //create class instant (object)

        Pet pet1 = new Pet();

        pet1.setOwnerName("j");
        pet1.setOwnerName("owen");
        pet1.setPerAge(2);


        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getPerName());
        System.out.println(pet1.getPerAge());


        Pet pet2 = new Pet();

        pet2.setOwnerName("jo");
        pet2.setPerName("joy");
        pet2.setPerAge(5);

        System.out.println(pet2.getOwnerName());
        System.out.println(pet2.getPerName());
        System.out.println(pet2.getPerAge());


        Pet pet3 = new Pet("j" , " oh",5);
        System.out.println(pet3.getOwnerName());
        System.out.println(pet3.getPerName());
        System.out.println(pet3.getPerAge());







    }//main



}//class

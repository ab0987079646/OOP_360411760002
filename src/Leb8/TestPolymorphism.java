package Leb8;

    public class TestPolymorphism {


        public static void main(String[] args) {
            PersonEX person1, person2, person3;
            person1 = new PersonEX("Mark", 1980);
            person2 = new Sheriff("Mateo", 1981, "California");
            person3 = new Police("Danny", 1986, "NYC");
            person1.introduce();
            person2.introduce();
            person3.introduce();
        }
    }
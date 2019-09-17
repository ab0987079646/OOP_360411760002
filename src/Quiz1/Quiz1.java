package Quiz1;

public class Quiz1 {
       private  String name ;
       private  String id;
       private  String majer;
       private  double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajer() {
        return majer;
    }

    public void setMajer(String majer) {
        this.majer = majer;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public String showgpa() {
        return "Quiz1{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", majer='" + majer + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Quiz1(String name, String id, String majer, double gpa) {
        this.name = name;
        this.id = id;
        this.majer = majer;
        this.gpa = gpa;
    }
}

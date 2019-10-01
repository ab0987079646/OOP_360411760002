package Leb8;


    public class triangle  extends Graphicobject {

        private double h;
        private double d;





        public triangle() {
        }

        public triangle(double h, double d) {
            this.h = h;
            this.d = d;
        }

        @Override
        void findarea() {

            super.area = 0.5*h*d;

            System.out.println("the area of circle: "+ super.area);


        }

        public double getH() {
            return h;
        }

        public void setH(double h) {
            this.h = h;
        }

        public double getD() {
            return d;
        }

        public void setD(double d) {
            this.d = d;
        }
    }
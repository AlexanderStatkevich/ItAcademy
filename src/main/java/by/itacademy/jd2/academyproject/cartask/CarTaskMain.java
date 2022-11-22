package by.itacademy.jd2.academyproject.cartask;

public class CarTaskMain {
    public static void main(String[] args) {

        Door door = new Door("2");
        Engine engine = new Engine("2.0");
        Wheel wheel = new Wheel("19");

        Parts[] parts = {door, engine, wheel};
        for (Parts p : parts) {
            System.out.println(p);
        }
    }
    public void test(){

    }
}
package by.itacademy.jd2.academyproject.cartask;

public class Wheel implements Parts {
    private final String radius;

    public Wheel(String radius) {
        this.radius = radius;
    }

    public String getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius='" + radius + '\'' +
                '}';
    }
}

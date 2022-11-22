package by.itacademy.jd2.academyproject.cartask;

public class Engine implements Parts {
    private final String volume;

    public Engine(String volume) {
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "volume='" + volume + '\'' +
                '}';
    }
}
package by.itacademy.jd2.academyproject.cartask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTaskMainTest {
    Parts[] parts;
    final String QUANTITY = "2";
    final String VOLUME = "2.0";
    final String RADIUS = "19";

    @BeforeEach
    void init() {
        Door door = new Door(QUANTITY);
        Engine engine = new Engine(VOLUME);
        Wheel wheel = new Wheel(RADIUS);
        parts = new Parts[]{door, engine, wheel};
    }

    @Test
    void checkAmountOfPartsAfterInit() {
        assertEquals(3, parts.length);
    }

    @Test
    void checkFieldsAfterReading() {
        Door part1 = (Door) parts[0];
        Engine part2 = (Engine) parts[1];
        Wheel part3 = (Wheel) parts[2];
        assertEquals(QUANTITY, part1.getQuantity());
        assertEquals(VOLUME, part2.getVolume());
        assertEquals(RADIUS, part3.getRadius());
    }
}
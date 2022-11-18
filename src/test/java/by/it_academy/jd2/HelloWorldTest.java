package by.it_academy.jd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void sumTest() {
        Integer sum = HelloWorld.sum(2, 2);
        assertEquals(4, sum);
    }
    @Test
    void anotherOne() {
        Integer sum = HelloWorld.sum(4, 2);
        assertEquals(6, sum);
    }
}
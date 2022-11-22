package by.itacademy.jd2.academyproject.countdigittask;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitInStringTest {

    @Test
    void ifStringContains5DigitsThenMethodReturn5(){
        String str = "1a2b3c4d5e";
        int count = CountDigitInString.digitsInString(str);
        assertEquals(5,count);
    }

}
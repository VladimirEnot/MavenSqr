package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test
    public void SquaresTest() {
        SQRService service = new SQRService() ;

        int actual = service.calculate(200 ,300);
        int expected = 3;

        assertEquals(expected,actual);
    }


}

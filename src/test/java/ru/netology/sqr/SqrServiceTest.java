package ru.netology.sqr;

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/sqr.csv")
    public void SquaresTest(int expected, int min, int max) {
        SQRService service = new SQRService() ;

        int actual;
        actual = service.calculate(min, max);

        assertEquals(expected,actual);
    }


}

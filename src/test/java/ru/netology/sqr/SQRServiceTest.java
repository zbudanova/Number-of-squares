package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNumberOfSquaresInTheRange200And300() {
        SQRService service = new SQRService();

        int lowerBound = 200;
        int upperBound = 300;
        int expected = 3;

        int actual = service.numberOfSquares(lowerBound, upperBound);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberOfSquaresInTheRange100And400() {
        SQRService service = new SQRService();

        int lowerBound = 100;
        int upperBound = 400;
        int expected = 11;

        int actual = service.numberOfSquares(lowerBound, upperBound);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

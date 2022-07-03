package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldFindNumber() {
        SQRService service = new SQRService();
        int minimal = 200;
        int maximal = 300;
        int expected = 3;
        int actual = service.calculate(minimal, maximal);
        assertEquals(expected,actual);

    }
}
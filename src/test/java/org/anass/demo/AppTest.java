package org.anass.demo;

import org.anass.demo.service.WorldService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private WorldService worldService;

    @BeforeEach
    void setUp() {
        worldService = new WorldService();
        System.out.println("Startup test ...");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        int a = 5;
        int b = 4;
        int expected = 9;
        int count = worldService.count(a, b);
        assertEquals(expected, count);
    }
    @Test
    public void shouldAnswerWithFalse() {
        int a = 5;
        int b = 4;
        int expected = 19;
        int count = worldService.count(a, b);
        assertNotEquals(expected, count);
    }
}

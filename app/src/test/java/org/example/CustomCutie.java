package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomCutieTest
{
    @Test
    void checkDescription1()
    {
        CustomCutie d1 = new CustomCutie("Test 1", 5);
        assertEquals(d1.description(), "Test 1");

    }

    @Test
    void checkDescription2()
    {
        CustomCutie d2 = new CustomCutie("Test 2", 10);
        assertEquals(d2.description(), "Test 2");

    }

    @Test
    void checkDescription3()
    {
        CustomCutie d3 = new CustomCutie("Test 3", 15);
        assertEquals(d3.description(), "Test 3");

    }

    @Test
    void checkCutenessRating1()
    {
        Cutie c1 = new CustomCutie("Test 1", 5);
        assertEquals(c1.cutenessRating(), 5);

    }

    @Test
    void checkCutenessRating2()
    {
        Cutie c2 = new CustomCutie("Test 2", 10);
        assertEquals(c2.cutenessRating(), 10);

    }

    @Test
    void checkCutenessRating3()
    {
        Cutie c3 = new CustomCutie("Test 3", 15);
        assertEquals(c3.cutenessRating(), 15);

    }

}
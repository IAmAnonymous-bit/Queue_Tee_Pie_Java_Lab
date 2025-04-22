package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KittyTest
{
    @Test
    void checkDescription()
    {
        Kitty mittens = new Kitty();
        assertEquals(mittens.description(), "It's a Kitty");

    }

    @Test
    void checkCutenessRating()
    {
        Cutie puss = new Kitty();
        assertEquals(puss.cutenessRating(), 11);

    }

}
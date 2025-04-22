package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PuppyTest
{
    @Test
    void checkDescription()
    {
        Puppy spot = new Puppy();
        assertEquals(spot.description(), "It's a Puppy");

    }

    @Test
    void checkCutenessRating()
    {
        Cutie dot = new Puppy();
        assertEquals(dot.cutenessRating(), 11);

    }

}
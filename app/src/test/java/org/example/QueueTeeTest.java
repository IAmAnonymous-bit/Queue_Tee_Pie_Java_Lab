package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTeeTest
{
    @Test
    void EnDeTest1()
    {
        QueueTee test1 = new QueueTee();
        Puppy p1 = new Puppy();
        CustomCutie c = new CustomCutie("Expected", 10);
        Kitty k1 = new Kitty();
        Puppy p2 = new Puppy();
        Kitty k2 = new Kitty();

        test1.enqueue(p1);
        test1.enqueue(c);
        test1.enqueue(k1);
        test1.enqueue(p2);
        test1.enqueue(k2);

        test1.dequeue();

        Cutie check = test1.dequeue();

        assertEquals(check.description(), "Expected");

    }

    @Test
    void EnDeTest2()
    {
        QueueTee test2 = new QueueTee();
        Puppy p1 = new Puppy();
        Kitty k1 = new Kitty();
        Puppy p2 = new Puppy();
        CustomCutie c = new CustomCutie("Expected", 10);
        Kitty k2 = new Kitty();
        Puppy p3 = new Puppy();
        Kitty k3 = new Kitty();
        Puppy p4 = new Puppy();
        Kitty k4 = new Kitty();
        Puppy p5 = new Puppy();

        test2.enqueue(p1);
        test2.enqueue(k1);
        test2.enqueue(p2);
        test2.enqueue(c);
        test2.enqueue(k2);
        test2.enqueue(p3);
        test2.enqueue(k3);
        test2.enqueue(p4);
        test2.enqueue(k4);
        test2.enqueue(p5);

        test2.dequeue();
        test2.dequeue();
        test2.dequeue();

        Cutie check = test2.dequeue();

        assertEquals(check.description(), "Expected");

    }

    @Test
    void EnDeTest3()
    {
        QueueTee test3 = new QueueTee(15);
        Puppy p1 = new Puppy();
        Kitty k1 = new Kitty();
        Puppy p2 = new Puppy();
        Kitty k2 = new Kitty();
        Puppy p3 = new Puppy();
        Kitty k3 = new Kitty();
        Puppy p4 = new Puppy();
        Kitty k4 = new Kitty();
        Puppy p5 = new Puppy();
        Kitty k5 = new Kitty();
        Puppy p6 = new Puppy();
        CustomCutie c = new CustomCutie("Expected", 10);
        Kitty k6 = new Kitty();
        Puppy p7 = new Puppy();
        Kitty k7 = new Kitty();

        test3.enqueue(p1);
        test3.enqueue(k1);
        test3.enqueue(p2);
        test3.enqueue(k2);
        test3.enqueue(p3);
        test3.enqueue(k3);
        test3.enqueue(p4);
        test3.enqueue(k4);
        test3.enqueue(p5);
        test3.enqueue(k5);
        test3.enqueue(p6);
        test3.enqueue(c);
        test3.enqueue(k6);
        test3.enqueue(p7);
        test3.enqueue(k7);

        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();
        test3.dequeue();

        Cutie check = test3.dequeue();

        assertEquals(check.description(), "Expected");

    }

    @Test
    void sizeTest1()
    {
        QueueTee test4 = new QueueTee();
        Puppy p1 = new Puppy();
        Kitty k2 = new Kitty();
        Puppy p3 = new Puppy();
        Kitty k4 = new Kitty();

        test4.enqueue(p1);
        test4.enqueue(k2);
        test4.enqueue(p3);
        test4.enqueue(k4);

        assertEquals(test4.size(), 4);

    }

    @Test
    void sizeTest2()
    {
        QueueTee test5 = new QueueTee();
        Puppy p1 = new Puppy();
        Kitty k2 = new Kitty();
        Puppy p3 = new Puppy();
        Kitty k4 = new Kitty();
        Puppy p5 = new Puppy();
        Kitty k6 = new Kitty();
        Puppy p7 = new Puppy();

        test5.enqueue(p1);
        test5.enqueue(k2);
        test5.enqueue(p3);
        test5.enqueue(k4);
        test5.enqueue(p5);
        test5.enqueue(k6);
        test5.enqueue(p7);

        assertEquals(test5.size(), 7);

    }

    @Test
    void sizeTest3()
    {
        QueueTee test6 = new QueueTee(15);
        Puppy p1 = new Puppy();
        Kitty k2 = new Kitty();
        Puppy p3 = new Puppy();
        Kitty k4 = new Kitty();
        Puppy p5 = new Puppy();
        Kitty k6 = new Kitty();
        Puppy p7 = new Puppy();
        Kitty k8 = new Kitty();
        Puppy p9 = new Puppy();
        Kitty k10 = new Kitty();
        Puppy p11 = new Puppy();
        Kitty k12 = new Kitty();
        Puppy p13 = new Puppy();

        test6.enqueue(p1);
        test6.enqueue(k2);
        test6.enqueue(p3);
        test6.enqueue(k4);
        test6.enqueue(p5);
        test6.enqueue(k6);
        test6.enqueue(p7);
        test6.enqueue(k8);
        test6.enqueue(p9);
        test6.enqueue(k10);
        test6.enqueue(p11);
        test6.enqueue(k12);
        test6.enqueue(p13);

        assertEquals(test6.size(), 13);

    }

    @Test
    void sizeTest4()
    {
        QueueTee test7 = new QueueTee();
        assertEquals(test7.size(), 0);

    }

}
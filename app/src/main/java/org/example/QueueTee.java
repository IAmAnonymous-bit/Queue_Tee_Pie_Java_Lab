package org.example;
import java.lang.IllegalArgumentException;
import java.util.Arrays;

public class QueueTee
{
    private Cutie[] queue;
    private int queueSize;

    public QueueTee() 
    {
        queue = new Cutie[10];
        queueSize = 0;

    }

    public QueueTee(int s)
    {
        queue = new Cutie[s];
        queueSize = 0;

    }

    public void enqueue(Cutie cutie)
    {
        if (queueSize == queue.length)
        {
            throw new IllegalArgumentException("QueueTee is Full!");

        }

        queue[queueSize] = cutie;
        queueSize++;

    }

    public Cutie dequeue()
    {
        if (queueSize == 0)
        {
            throw new IllegalArgumentException("QueueTee is Empty!");

        }

        Cutie outputCutie = queue[0];
        for (int i = 0; i < queueSize - 1; i++)
        {
            queue[i] = queue[i+1];
            
        }
        queueSize--;
        return outputCutie;

    }

    public int size()
    {
        return queueSize;

    }

}
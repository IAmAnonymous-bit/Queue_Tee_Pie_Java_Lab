package org.example;

public class CustomCutie implements Cutie
{
    private String d;
    private Integer c;

    public CustomCutie(String d, Integer c)
    {
        this.d = d;
        this.c = c;

    }

    public String description()
    {
        return d;

    }

    public Integer cutenessRating()
    {
        return c;
        
    }

}
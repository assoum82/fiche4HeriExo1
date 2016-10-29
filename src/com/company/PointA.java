package com.company;

/**
 * Created by vaio on 29/10/2016.
 */
public class PointA extends Point {
    public  PointA(double x, double y)
    {
        super(x,y);
    }
    public  PointA(double x)
    {
        super(x);
    }
    public  PointA()
    {
        super();
    }


    public void afficheCord()
    {
        System.out.println("("+getX()+","+getY()+")");
    }
}



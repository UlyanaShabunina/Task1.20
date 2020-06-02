package com.company;

import java.lang.Math;

public class Main {
    static void mah(int x,int y, int z)
    {

        if (x+y<z||x+z<y||z+y<x)
        {
            System.out.println("these ribs do not belong to a single triangle");
        }
        else if ((x==y)&&(y==z))
        {
            System.out.println("Perimeter of the triangle");
            System.out.println(x+y+z);
            System.out.println("Area of the triangle");
            System.out.println(0.5 * x * Math.sqrt(Math.pow (y,2) - Math.pow(x/2,2)));
        }
        else if (x==y)
        {
            System.out.println("Perimeter of the triangle");
            System.out.println(x+y+z);
            System.out.println("Area of the triangle");
            System.out.println( 0.5 * z *  Math.sqrt(Math.pow (x,2) - Math.pow(y/2,2)));
        }
        else if (y==z)
        {
            System.out.println("Perimeter of the triangle");
            System.out.println(x+y+z);
            System.out.println("Area of the triangle");
            System.out.println( 0.5 * x *  Math.sqrt(Math.pow (y,2) - Math.pow(z/2,2)));
        }
        else if (x==z)
        {
            System.out.println("Perimeter of the triangle");
            System.out.println(x+y+z);
            System.out.println("Area of the triangle");
            System.out.println( 0.5 * y *  Math.sqrt(Math.pow (x,2) - Math.pow(z/2,2)));
        }
        else
        {
            System.out.println("Perimeter of the triangle");
            System.out.println(x+y+z);
            System.out.println("Area of the triangle");
            double q = (Math.pow(x,2) + Math.pow(z,2)- Math.pow(y,2))/(2*x*z);
            System.out.println(q);
            double r =Math.toDegrees(Math.acos(q));
            System.out.println(r);
            System.out.println(0.5*(z * x)  *  (Math.sin(r)));
        }
    }
    public static void main(String[]args)
    {
        mah(5,5,5);


    }


}
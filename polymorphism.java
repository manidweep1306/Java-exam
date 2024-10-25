// run time polymorphism

import java.util.*;
class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
public class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is running");
    }

    public static void main(String args[])
    {    
            Bike b = new Bike();
            b.run();
     }   
}
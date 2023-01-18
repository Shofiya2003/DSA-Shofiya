package Inheritance;

public class Surgeon extends Doctor {
    void treatPatients(){
        System.out.println("Perform surgeries"); //Override the method in the super class
    }

    void makeIncision(){
        System.out.println("make incision");
    }
}

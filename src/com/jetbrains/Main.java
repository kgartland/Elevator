package com.jetbrains;
import java.util.Scanner;

class Elevator {
    //Define Elevator states and behaviors
    String name;
    int floor;
    int direction;
    int moving;
}

public class Main {

    public static void main(String[] args) {
        //Define Object Elevator with an array of 3.
        Elevator[] myElevator = new Elevator[3];

        //Define each Object per Elevator
        myElevator[0] = new Elevator();
        myElevator[1] = new Elevator();
        myElevator[2] = new Elevator();

        //Name Elevator Objects
        myElevator[0].name = "Elevator A";
        myElevator[1].name = "Elevator B";
        myElevator[2].name = "Elevator C";

        //Assign Elevator Objects a floor #
        myElevator[0].floor = (int) (Math.random() * 10);
        myElevator[1].floor = (int) (Math.random() * 10);
        myElevator[2].floor = (int) (Math.random() * 10);

        //Assign Elevator Objects a 0 or 1 (direction toward me 1 not 0)
        myElevator[0].direction = (int) (Math.random() * 2);
        myElevator[1].direction = (int) (Math.random() * 2);
        myElevator[2].direction = (int) (Math.random() * 2);

        //Assign Elevator Objects a 0 or 1 (moving 1 not moving 0)
        myElevator[0].moving = (int) (Math.random() * 2);
        myElevator[1].moving = (int) (Math.random() * 2);
        myElevator[2].moving = (int) (Math.random() * 2);

        //The floor I'm currently on
        int myFloor = (int) (Math.random() * 10);

        //print out the values
        System.out.println("You are currently on Floor " + myFloor);

        System.out.println("Elevator A is currently on floor " + myElevator[0].floor);

        //convert Elevator A direction variable to words
        if (myElevator[0].direction == 0) {
            System.out.println("Elevator A is moving towards your floor.");
        }
        else {
            System.out.println("Elevator A is moving away from your floor.");
        }

        //convert Elevator A moving variable to words
        if (myElevator[0].moving == 0) {
            System.out.println("Elevator A is active.");
        }
        else {
            System.out.println("Elevator A is inactive.");
        }

        System.out.println("Elevator B is currently on floor " + myElevator[1].floor);

        //convert Elevator A direction variable to words
        if (myElevator[1].direction == 0) {
            System.out.println("Elevator B is moving towards your floor.");
        }
        else {
            System.out.println("Elevator B is moving away from your floor.");
        }

        //convert Elevator A moving variable to words
        if (myElevator[1].moving == 0) {
            System.out.println("Elevator B is active.");
        }
        else {
            System.out.println("Elevator B is inactive.");
        }

        //convert Elevator A direction variable to words
        if (myElevator[2].direction == 0) {
            System.out.println("Elevator C is moving towards your floor.");
        }
        else {
            System.out.println("Elevator C is moving away from your floor.");
        }

        //convert Elevator A moving variable to words
        if (myElevator[2].moving == 0) {
            System.out.println("Elevator C is active.");
        }
        else {
            System.out.println("Elevator C is inactive.");
        }

        System.out.println("Elevator C is currently on floor " + myElevator[2].floor);

        //Enter your floor number
        String mySelection;
        System.out.print("Enter your floor number: ");
        Scanner user_input = new Scanner(System.in);

        mySelection = user_input.next();

        System.out.println("Your selection was floor " + mySelection);

    }
}

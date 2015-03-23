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
        Elevator elevatorA = new Elevator();
        Elevator elevatorB = new Elevator();
        Elevator elevatorC = new Elevator();

        //Assign Elevator Objects a floor #
        elevatorA.floor = (int) (Math.random() * 10);
        elevatorB.floor = (int) (Math.random() * 10);
        elevatorC.floor = (int) (Math.random() * 10);

        //Assign Elevator Objects a 0 or 1 (direction toward me 1 not 0)
        elevatorA.direction = (int) (Math.random() * 2);
        elevatorB.direction = (int) (Math.random() * 2);
        elevatorC.direction = (int) (Math.random() * 2);

        //Assign Elevator Objects a 0 or 1 (moving 1 not moving 0)
        elevatorA.moving = (int) (Math.random() * 2);
        elevatorB.moving = (int) (Math.random() * 2);
        elevatorC.moving = (int) (Math.random() * 2);

        //The floor I'm currently on
        int myFloor = (int) (Math.random() * 10);

        //print out the values
        System.out.println("You are currently on Floor " + myFloor);

        System.out.println("Elevator A is currently on floor " + elevatorA.floor);

        //convert Elevator A direction variable to words
        if (elevatorA.direction == 0) {
            System.out.println("Elevator A is moving towards your floor.");
        }
        else {
            System.out.println("Elevator A is moving away from your floor.");
        }

        //convert Elevator A moving variable to words
        if (elevatorA.moving == 0) {
            System.out.println("Elevator A is active.");
        }
        else {
            System.out.println("Elevator A is inactive.");
        }

        System.out.println("Elevator B is currently on floor " + elevatorB.floor);

        //convert Elevator A direction variable to words
        if (elevatorB.direction == 0) {
            System.out.println("Elevator B is moving towards your floor.");
        }
        else {
            System.out.println("Elevator B is moving away from your floor.");
        }

        //convert Elevator A moving variable to words
        if (elevatorB.moving == 0) {
            System.out.println("Elevator B is active.");
        }
        else {
            System.out.println("Elevator B is inactive.");
        }

        //convert Elevator A direction variable to words
        if (elevatorC.direction == 0) {
            System.out.println("Elevator C is moving towards your floor.");
        }
        else {
            System.out.println("Elevator C is moving away from your floor.");
        }

        //convert Elevator A moving variable to words
        if (elevatorC.moving == 0) {
            System.out.println("Elevator C is active.");
        }
        else {
            System.out.println("Elevator C is inactive.");
        }

        System.out.println("Elevator C is currently on floor " + elevatorC.floor);

        //Enter your floor number
        String mySelection;
        System.out.print("Enter your floor number: ");
        Scanner user_input = new Scanner(System.in);

        mySelection = user_input.next();

        System.out.println("Your selection was floor " + mySelection);

    }
}

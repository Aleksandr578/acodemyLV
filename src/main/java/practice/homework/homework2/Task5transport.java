package practice.homework.homework2;

import java.util.Scanner;

public class Task5transport {
    public static void main(String [] args) {

        //System.out.format("Input an integer x within 1-7%n");
       // Scanner input = new Scanner(System.in);
       // int x = input.nextInt();

        String transport = "scooter";

        switch (transport) {
            case "car":
                System.out.format("car is available%n");
                break;
            case "bus":
                System.out.format("bus is available%n");
                break;
            case "plane":
                System.out.format("plane is available%n");
                break;
            case "scooter":
                System.out.format("scooter is available%n");
                break;
            case "boat":
                System.out.format("boat is available%n");
                break;
            default:
                System.out.format("This transport is not available: %s%n", transport);
        }

        String [] userTransport = {"car", "boat", "plane", "metro", "scooter"};
        for (String myTransport : userTransport) {
            if (myTransport.equals("boat")) {
                System.out.println("Transport is available");
            }
        }

    }
}

package gr.aueb.cf.ch2.ch3;
/**
 * turn lights on , if it is raining
 * and car is running (>100) or is dark.
 */

import java.util.Scanner;

public class LightsOn {
    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean areLightsOn = false;
        boolean isRaining = false;
        int carSpeed;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert if car is running");
        isCarRunning = in.nextBoolean();

        System.out.println("Please insert if are lights on");
        areLightsOn =  in.nextBoolean();

        System.out.println("Please insert car speed");
        carSpeed =  in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);

        System.out.println("turn ligths on:" + areLightsOn);











    }
}

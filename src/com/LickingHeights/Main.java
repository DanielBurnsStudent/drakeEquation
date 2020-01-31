package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */
        int N;
        int rStar;
        double f_p;
        int numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int L;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("How many stars are formed every year in our galaxy? (1)");
        rStar = keyboard.nextInt();

        System.out.println("How many of these stars produce planets? (0.2 to 0.5)");
        f_p = keyboard.nextInt();

        System.out.println("Stars with planets will have between 1 and 5 capable of life ( 1 to 5)");
        numberOfExoplanets = keyboard.nextInt();

        System.out.println("What Percent of these planets will develop life? (0-100%)");
        f_l = keyboard.nextInt();

        System.out.println("What percent of these will develop intelligent life? (0-100%)");
        f_i = keyboard.nextInt();

        System.out.println("What percent of these will be able to communicate? (0-100%)");
        f_c = keyboard.nextInt();

        N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L;

        System.out.println("The number of intelligent species that are out there \n" +
                "that can communicated with us is: " + N);

    }

}

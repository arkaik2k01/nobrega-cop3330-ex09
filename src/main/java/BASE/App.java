package BASE;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Nobrega
 */

//Exercise 9 - Paint Calculator
//Sometimes you have to round up to the next number rather than follow standard rounding rules.
//
//Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet.
// Display the number of gallons needed to paint the ceiling as a whole number.
//
//Example Output
//You will need to purchase 2 gallons of paint to cover 360 square feet.

//Remember, you can’t buy a partial gallon of paint. You must
//round up to the next whole gallon.
//
//Constraints
//Use a constant to hold the conversion rate.
//Ensure that you round up to the next whole number.

//Challenges
//Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
//Implement support for a round room.
//Implement support for an L-shaped room.
//Implement a mobile version of this app so it can be used at the hardware store.

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);
    final int COVERAGE = 350; //One gallon = 350 square feet

    public static void main(String[] args)
    {
        App prog = new App();
        //Input
        System.out.print("What is the length of your room? ");
        int len = in.nextInt();
        System.out.print("What is the width of your room? ");
        int wid = in.nextInt();

        //Calculations
        int squareFeet = prog.calculate(len, wid);
        int gPerSquareFeet = prog.gallonPerSquareFeet(squareFeet);

        //Output
        prog.output(gPerSquareFeet, squareFeet);
    }

    private int calculate(int len, int wid)
    {
        return len * wid;
    }

    private int gallonPerSquareFeet(int squareFeet)
    {
        return (int) Math.ceil(((double)squareFeet)/((double)COVERAGE));
    }

    private void output(int gallon, int squareFeet)
    {
        System.out.println("You will need to purchase "  + gallon + " gallons of paint to cover "+ squareFeet +" square feet.");
    }
}

package com.company;
import java.util.Scanner;
/***********************************************************
 * Assignment
 *
 * Complete the following program. Use the Scanner class to read the following string into variables.
 * Input String: "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city
 *
 */

public class Main {

    public static void main (String [] args)
    {
        /***********************************************************
         *
         * Methods of the Scanner class
         * Method 	Returns
         * int nextInt() 	Returns the next token as an int.
         * long nextLong() 	Returns the next token as a long.
         * float nextFloat() 	Returns the next token as a float.
         * double nextDouble() 	Returns the next token as a long.
         * String next() 	Finds and returns the next complete token
         *                  from this scanner and returns it as a string;
         *                  a token is usually ended by whitespace such as a blank or line break.
         *                  If no token exists, NoSuchElementException is thrown.
         * String nextLine() 	Returns the rest of the current line, excluding any line separator at the end.
         * void close() 	Closes the scanner object.
         *
         */
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter address information");

        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        int houseNumber = keyboard.nextInt();
        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();

//        System.out.println("firstInitial: " + firstInitial );
//        System.out.println("lastName: " + lastName );
//        System.out.println("houseNumber: " + houseNumber );
//        System.out.println("streetName: " + streetName );
//        System.out.println("city: " + city );


        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}

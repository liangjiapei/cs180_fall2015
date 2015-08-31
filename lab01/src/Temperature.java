/**
 * CS180 - Lab 01
 * Hello, world!
 * @author Jiapei Liang, liang98@purdue.edu, lab 812
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double fahrenheit;
        double celcius;
        //Scanner s = new Scanner(System.in);
        //System.out.println("Enter the temperature in Fahrenheit: ");
        //fahrenheit = s.nextDouble();
        fahrenheit = 212.0;
        celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);

    }
}


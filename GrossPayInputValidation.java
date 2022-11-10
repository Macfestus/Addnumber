package chapter4;

import java.util.Scanner;

/*
*WHILE LOOP:
* *Each store employee makes $15 an hour. Write a program that allows the employee
* to enter the number of hours for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

    public static void main(String arg[]){
        //Initialize known variables
        int rate = 15;
        int maxhour = 40;

        // Get input for the unknown
        System.out.print("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursworked = scanner.nextDouble();

        //Validate input
        while(hoursworked > maxhour || hoursworked < 1){
           System.out.print("Invalid entry. Yours hours must be between 1 and 40. Try again.");
           hoursworked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross
        double gross = rate * hoursworked;
        System.out.print("Gross pay: $" + gross);
    }
}

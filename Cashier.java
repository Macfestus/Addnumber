package chapter4;

import java.util.Scanner;

/*
*FOR LOOP
* Write a cashier program that scan a given number of items and tally the cost.
 */
public class Cashier {

   public static void main(String args[]){
       System.out.println("Enter the number of items you would like to scan");
       Scanner scanner = new Scanner(System.in);
       int quantity = scanner.nextInt();

       double total = 0;

       // Create loop to iterate through all of the items and accumulate the cost
       for(int i=0; i<quantity; i++){

           System.out.print("Ennter the cost of the item:");
           double price = scanner.nextDouble();

           total = total + price;
       }

        scanner.close();

       System.out.println("Your total is $" + total);
   }
}

/* COSC2135 - Programming 1 - Assignment 1
 * Study Period 3 - 2013
 * 
 * Student - Andrew John Sanger 
 * 
 * Student Number - 3440468
 * 
 * PROGRAM STAGE 1
 * -- Complete comments on stage 3 only
 */

import java.util.Scanner;

public class Stage_1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.println("\t\t=== Basic Car Hire Booking System ===");

      System.out.print("\nEnter Customer Name: ");
      String custName = input.nextLine();
      System.out.print("Enter Customer Address: ");
      String custAddress = input.nextLine();
      System.out.print("Enter Customer Phone Number: ");
      String custPhone = input.nextLine();
      System.out.print("Enter Customer Licence Number: ");
      String custLicNum = input.nextLine();

      System.out.print("\nEnter Credit Card Number: ");
      String custCardNum = input.nextLine();
      System.out.print("Enter Card Expiry Date (eg. 01/2015): ");
      String custCardExp = input.nextLine();

      System.out.print("\nEnter Hire Length (Days): ");
      int hireLength = input.nextInt();

      if (input.hasNextLine())
      {
         input.nextLine();
      }

      System.out.print("Enter Make & Model of Hired Car: ");
      String carMakeModel = input.nextLine();
      System.out.print("Enter Registration Number of Hired Car: ");
      String carRegoNum = input.nextLine();

      System.out.print("Enter Daily Hire Rate: ");
      double hireRate = input.nextDouble();

      double basicHireCharge = hireLength * hireRate;

      System.out.println("\n=== Customer Details ===");
      System.out.printf("\n%-30s%40s", "Name:", custName);
      System.out.printf("\n%-30s%40s", "Address:", custAddress);
      System.out.printf("\n%-30s%40s", "Phone:", custPhone);
      System.out.printf("\n%-30s%40s", "Licence No:", custLicNum);
      System.out.printf("\n%-30s%40s", "Credit Card No:", custCardNum);
      System.out.printf("\n%-30s%40s", "Credit Card Expiry:", custCardExp);

      System.out.println("\n\n=== Hire Car Details ===");
      System.out.printf("\n%-30s%40s", "Hire Car Make & Model:", carMakeModel);
      System.out.printf("\n%-30s%40s", "Hire Car Registration No:", carRegoNum);
      System.out.printf("\n%-30s%40d", "Hire Length (in Days):", hireLength);
      System.out.printf("\n%-30s%40.2f", "Daily Hire Rate: ", hireRate);
      System.out.printf("\n%-30s%40.2f", "Basic Hire Charge: ", basicHireCharge);
   }
}

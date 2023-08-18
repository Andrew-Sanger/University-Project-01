/* COSC2135 - Programming 1 - Assignment 1
 * Study Period 3 - 2013
 * 
 * Student - Andrew John Sanger 
 * 
 * Student Number - 3440468
 * 
 * PROGRAM STAGE 2
 * -- Complete comments on stage 3 only
 */

import java.util.Scanner;

public class Stage_2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      final double smallRate = 80.0;
      final double mediumRate = 110.0;
      final double largeRate = 140.0;

      double hireRate = 0;
      double lateReturnCharge = 0;

      System.out.println("\t\t=== Adjusted Car Hire Booking System ===");

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

      System.out.print("\nEnter Car Size - (S)mall, (M)edium or (L)arge: ");
      char carSize = input.nextLine().charAt(0);
      System.out.print("Enter Number of Days Hired: ");
      int hireLengthActual = input.nextInt();

      if (carSize == 'S' || carSize == 's')
      {
         hireRate = smallRate;
      }
      else if (carSize == 'M' || carSize == 'm')
      {
         hireRate = mediumRate;
      }
      else if (carSize == 'L' || carSize == 'l')
      {
         hireRate = largeRate;
      }

      if (hireLengthActual > hireLength)
      {
         lateReturnCharge = (hireLengthActual - hireLength) * (hireRate * 2);
      }

      double basicHireCharge = hireLength * hireRate;
      double adjHireCharge = basicHireCharge + lateReturnCharge;

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
      System.out
               .printf("\n%-30s%40.2f", "Basic Hire Charge: ", basicHireCharge);

      System.out.printf("\n\n%-30s%40d", "Days Hired:", hireLengthActual);
      System.out.printf("\n%-30s%40.2f", "Late Return Surcharge:",
                        lateReturnCharge);
      System.out
               .printf("\n%-30s%40.2f", "Adjusted Hire Charge:", adjHireCharge);
   }
}

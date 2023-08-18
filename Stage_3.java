/* COSC2135 - Programming 1 - Assignment 1
 * Study Period 3 - 2013
 * 
 * Student - Andrew John Sanger 
 * 
 * Student Number - 3440468
 * 
 * FINAL PROGRAM - STAGE 3
 * 
 * This program prompts the user to enter Customer information for a car
 * hire company. The program gets personal information, payment info, and
 * info on the car being hired including cost, length of hire, damage done
 * to the car and any fines incurred. All information is displayed at the end
 * of the program run. 
 */

import java.util.Scanner;

public class Stage_3
{
   public static void main(String[] args)
   {
      // Creates a Scanner
      Scanner input = new Scanner(System.in);

      // Declares the values for costs of different vehicle sizes
      final double smallRate = 80.0;
      final double mediumRate = 110.0;
      final double largeRate = 140.0;

      // Declares the rest of the values to be used in the program
      double hireRate = 0, lateReturnCharge = 0;
      char repairMenuSelection = ' ';
      double repairCost = 0, finalRepairCost = 0;
      double fineCost = 0, finalFineCost = 0;
      String damage = " ", finalDamageList = " ";
      String fine = " ", finalFineList = " ";
      int leaveRepairMenu = 0; 
      int noDamageEntered = 0, noFineEntered = 0;

      // Creates the header for the program
      System.out.println("-----------------------------------" +
                         "-----------------------------------");
      System.out.println("=================== Final Car Hire " +
                         "Booking System ====================");
      System.out.println("-----------------------------------" +
                         "-----------------------------------");

      // Prompts user for customers personal info
      System.out.print("\nEnter Customer Name: ");
      String custName = input.nextLine();
      System.out.print("Enter Customer Address: ");
      String custAddress = input.nextLine();
      System.out.print("Enter Customer Phone Number: ");
      String custPhone = input.nextLine();
      System.out.print("Enter Customer Licence Number: ");
      String custLicNum = input.nextLine();

      // Prompts user for customers payment details
      System.out.print("\nEnter Credit Card Number: ");
      String custCardNum = input.nextLine();
      System.out.print("Enter Card Expiry Date (eg. 01/2015): ");
      String custCardExp = input.nextLine();

      // Prompts user for hire car details
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

      /*
       * While loop displays the Damage and Traffic infringement menu. Menu will
       * remain available until X is pressed, this causes the leaveRepairMenu
       * value to be != 0. Pressing a key other than A, B, or X causes an error
       * message to appear
       */
      while (leaveRepairMenu == 0)
      {
         if (input.hasNextLine())
            input.nextLine();

         System.out.println("\n-----------------------------" +
                            "-----------------------------------------");
         System.out.println("======== Damage Repair / Traffic " +
                            "Infringement Data Entry Menu ========");
         System.out.println("-------------------------------" +
                            "---------------------------------------");
         System.out.println("\nA - Record Damage Repair Details.");
         System.out.println("B - Record Traffic Infringement Details.");
         System.out.println("X - Exit");
         System.out.print("\nEnter your selection: ");

         // Gets first character of input
         repairMenuSelection = input.nextLine().charAt(0);

         if (repairMenuSelection == 'A' || repairMenuSelection == 'a')
         {
            System.out.print("\nEnter description of damage repaired " +
                             "on vehicle: ");
            damage = input.nextLine();
            System.out.print("Enter cost of repair to damage: ");
            repairCost = input.nextDouble();

            /*
             * Adds inputted damage info and cost into their respective
             * variables
             */
            finalDamageList = finalDamageList + "\n - " + damage +
                              " - ($" + repairCost + ")";
            finalRepairCost += repairCost;

            noDamageEntered++;
         }
         else if (repairMenuSelection == 'B' || repairMenuSelection == 'b')
         {
            System.out.print("\nEnter details of traffic infringement: ");
            fine = input.nextLine();
            System.out.print("Enter the traffic fine incurred: ");
            fineCost = input.nextDouble();

            /*
             * Adds inputted fine info and cost into their respective variables
             */
            finalFineList = finalFineList + "\n - " + fine +
                            " - ($" + fineCost + ")";
            finalFineCost += fineCost;

            noFineEntered++;
         }
         else if (repairMenuSelection == 'X' || repairMenuSelection == 'x')
         {
            leaveRepairMenu++;
         }
         else
         {
            System.out.println("You have entered an incorrect value. " +
                               "Please press enter to try again..");
            continue;
         }
      }

      /*
       * If statement decides what value hireRate should be depending on vehicle
       * size
       */
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

      // Works out if late fees are needed to be added
      if (hireLengthActual > hireLength)
      {
         lateReturnCharge = (hireLengthActual - hireLength) * (hireRate * 2);
      }

      double basicHireCharge = hireLength * hireRate;
      double adjHireCharge = basicHireCharge + lateReturnCharge;
      double finalHireCharge = adjHireCharge + finalRepairCost + finalFineCost;

      // Displays customer information
      System.out.println("\n----------------------------------" +
                         "------------------------------------");
      System.out.println("========================== Customer " +
                         "Details ==========================");
      System.out.println("------------------------------------" +
                         "----------------------------------");
      System.out.printf("\n%-30s%40s", "Name:", custName);
      System.out.printf("\n%-30s%40s", "Address:", custAddress);
      System.out.printf("\n%-30s%40s", "Phone:", custPhone);
      System.out.printf("\n%-30s%40s", "Licence No:", custLicNum);
      System.out.printf("\n%-30s%40s", "Credit Card No:", custCardNum);
      System.out.printf("\n%-30s%40s", "Credit Card Expiry:", custCardExp);

      // Displays hire car information
      System.out.println("\n\n--------------------------------" +
                         "--------------------------------------");
      System.out.println("========================== Hire Car " +
                         "Details ==========================");
      System.out.println("------------------------------------" +
                         "----------------------------------");
      System.out.printf("\n%-30s%40s", "Hire Car Make & Model:",
                        carMakeModel);
      System.out.printf("\n%-30s%40s", "Hire Car Registration No:",
                        carRegoNum);
      System.out.printf("\n%-30s%40d", "Hire Length (in Days):",
                        hireLength);
      System.out.printf("\n\n%-30s%40.2f", "Daily Hire Rate: ",
                        hireRate);
      System.out.printf("\n%-30s%40.2f", "Basic Hire Charge: ",
                        basicHireCharge);

      System.out.printf("\n\n%-30s%40d", "Days Hired:",
                        hireLengthActual);
      System.out.printf("\n%-30s%40.2f", "Late Return Surcharge:",
                        lateReturnCharge);
      System.out.printf("\n%-30s%40.2f", "Adjusted Hire Charge:",
                        adjHireCharge);

      // Displays damage information
      System.out.println("\n\n----------------------------------" +
                         "------------------------------------");
      System.out.println("======================= Damage Repair " +
                         "Details ========================");
      System.out.println("--------------------------------------" +
                         "--------------------------------");
      // Displays message if no info was entered
      if (noDamageEntered == 0)
      {
         System.out.println("\n NO DAMAGE RECORDED");
      }
      else
      {
         System.out.println(finalDamageList);
      }
      System.out.printf("\n%-30s%40.2f", "Damage Repair Total: ",
                        finalRepairCost);

      // Displays fine information
      System.out.println("\n\n----------------------------------" +
                         "------------------------------------");
      System.out.println("======================== Traffic Fine " +
                         "Details ========================");
      System.out.println("--------------------------------------" +
                         "--------------------------------");
      // Displays message if no info was entered
      if (noFineEntered == 0)
      {
         System.out.println("\n NO FINES RECORDED");
      }
      else
      {
         System.out.println(finalFineList);
      }
      System.out.printf("\n%-30s%40.2f", "Traffic Fine Total: ",
                        finalFineCost);

      System.out.println("\n\n----------------------------------" +
                         "------------------------------------");

      // Displays the grand total of all charges incurred
      System.out.printf("\n%-30s%40.2f", "Final Hire Charge:",
                        finalHireCharge);
   }
}

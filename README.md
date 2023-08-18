# University-Project-01
## University project 1 - Programming 1 - Basic Car Hire Booking System

The first project in the Programming 1 course. This is my first ever major project using the Java language.

***The following is copied directly from the project.***

## Background Information (Preamble)

For this assignment you need to write a console application in the Java programming language which simulates the functionality of a basic car hire booking system.

When a customer first contacts the car hire company to make a car hire booking the following details need to be recorded:
- The customer name, address, phone number and drivers licence number
- The customer’s credit card number and the expiry date of that credit card
- The start date of the booking (deleted)
- The number of days the car is required for (ie. the hire length)
- The make / model  and registration number of the car that is to be assigned to the customer
- The daily car hire fee that applies - initially this will be just an amount entered by the user, but in later stages of the assignment the daily car hire rates will be based on the size of the car that is being hired.

When the customer returns a car that they have hired the following details will need to be recorded as required:
- The number of days the car was actually hired out for (a surcharge applies for cars that are returned “late”)
- The description and cost of any repairs required to rectify damage that might have occurred while the customer has been driving the hire car.
- The details and cost of any traffic infringement fines that the customer has incurred whilst they have been driving the hire car.

The functionality for this system will be broken down across three stages in this assignment - the final stage is the end goal (ie. the fully implemented program) but each stage builds on the functionality from the previous stage(s) and introduces something new to the program.

### Stage 1 – Basic Car Hire Booking System (30 marks)
To begin with the program needs to gather some basic information about the customer, as well as basic details about the care hire booking itself as described below (input types for each group of variables are shown in brackets): 
- The customer’s name, address, phone number and drivers licence number (String)
-	The customer’s credit card number and expiry date (String)
-	The hire length (number of days) the customer requires the car for (int)
-	The make / model and registration number of the car to be assigned to the customer (String)
-	The daily hire rate that applies to the car hire booking (double)

The program should prompt the user to enter these values and then read them into the program from the keyboard and store them in appropriately-typed variables for later use - **note that your program MUST prompt the user to enter these values in the order specified above.  You will lose marks for changing the input sequence described above so that your program reads input in a different order.**

**Note: You may assume that the user will enter values in the correct type and within the specified range where one applies, so there is no requirement to validate input in any way, shape or form here.
Once all required values have been entered you will need to calculate the basic hire charge as follows:**

> basic hire charge = hire length * daily hire rate

After the program has gathered the required input values from the user and has performed the required calculations it should display a basic summary of the car hire booking details in a tabulated format (ie. with values aligned/justified in columns) as shown in the sample execution run on the next page.

You must use field width modifiers appropriately in System.out.printf() to align the output into “columns” when displaying the content in the care hire booking details summary – no padding with hard-coded spaces or tabs is permitted (headings are however exempt from this constraint).

**You should use appropriately named variables to store the relevant pieces of information that need to be gathered from the user.**

**Note: As we are just getting started we are not factoring in the variable daily hire fees for different sized cars or the late return surcharge discussed in the preamble on page 1 at this point - these additional requirements will be introduced in the stages 2/3 of the assignment.**

### Stage 2 -  Incorporating Variable Car Hire Rates / Surcharges (30 marks)
Looking back on the car hire booking system scenario in stage 1 it wasn’t all that “realistic” in that other factors such as having different daily car hire rates for different sized cars, as well as a surcharge for the late returning of the car (if applicable) will also need to be incorporated into the final car hire booking charge.

In this stage the car hire booking system calculations will initially incorporate variable daily car hire fee rates based on the car size that the customer required (this will replace the user-entered daily hire fee from stage 1) - the daily hire rates for different car sizes are broken down below:

Car Hire Fee Schedule

- Small (S)	-> $80 per day
- Medium (M)	->$110 per day
- Large (L)	-> $140 per day

The car hire booking system calculations will also incorporate a surcharge for returning the car late if the customer fails to return the car on time (ie. they have used it for a period longer than the hire length that was originally specified for the booking) - a surcharge of 200% of the applicable daily car hire fee is added for each day that the return of the hire car was late.

***Changes to the previous program***
You will need to either write a new program -OR- update the existing program from Stage 1 to include the changes to the car hire booking system as described above.

In this updated version of the car hire booking system you should prompt the user to enter the size of the car by (a String value for which you may assume that the user will enter either S, M or L representing the “Small”, “Medium” and “Large” car sizes respectively).

The program should then prompt the user to enter the number of days the car was hired out for. 

Once this information has been read in the program should then determine which daily booking fee should be applied based on the car size the customer requires and calculate / store the basic booking fee in a variable.

After this the program should then proceed to determine whether a surcharge for late return of the hire car should be included and (if required) calculate / store the corresponding surcharge in an appropriately typed variable for later reference.

***If the car was hired out for longer than the original hire length (in days) then the late return surcharge will be 200% of the applicable daily car hire rate for each additional day that the car was hired out for.***

***eg. for a small car (hire fee $80 per day) that was originally booked for 7 days and was returned after 10 days this late return surcharge will be $480 - ie. (2 * $80) * 3 days late = $480.***

Once this surcharge has been calculated (if required) then the program should proceed to work out the adjusted hire charge as shown below:

> adjusted hire charge = basic hire charge + late return surcharge (if applicable)
> 
***Note: You should define appropriately named variables to store the required information in for later reference and you should also define constants within your program for the daily car hire rates mentioned above.***

Once all required calculations have been performed and the adjusted hire charge has been worked out the program should proceed to display updated car hire booking details which include the information shown in stage 1, as well as information regarding any late return surcharge that may apply and, finally, the adjusted booking charge amount.

## Stage 3 – Final Car Hire Booking System (35 marks)

Now that we’ve incorporated car size-based daily hire rates and late return surcharges into the car hire booking charge calculations in Stage 2, we are move onto the final aspect of the program - the recording of details relating to any repairs that may be needed to rectify any damage that has occurred and any traffic infringements (fines) that have been charged against the car while the customer had the car hired out.

Details for each individual damage issue noted and traffic infringement incurred by the customer whilst they were driving the vehicle have to be entered one at a time into the system - these details are recorded in separate “lists” and a running total for the corresponding surcharges will also need to be kept so that they can be incorporated into the final hire charge calculation later on.

To cater for the issues described above you need to either write a new program -OR- update the existing program from Stage 2 so that a repetitive data entry feature (menu) is incorporated for any damage repairs that are required and any traffic infringement fines that were charged against the hire car whilst the customer was driving the vehicle.

***Damage Repair / Traffic Infringement recording menu***

This data entry mechanism should be menu driven, with options for entering damage repair details and entering traffic infringement details, as well as an exit option which allows the user to exit the menu and proceed with the final hire charge calculations.  

The menu itself should be case insensitive (i.e. it should accept both the upper and lower case versions of each valid menu selection) - this menu feature should also display a suitable error message when the user does not enter a valid selection from the menu.

The menu feature should also be implemented using a suitable loop so that the program can “return” back to the menu “naturally” after processing has been completed for the data entry option that was selected - this loop should only be exited if the user explicitly selects the “Exit” option from the menu.

***Damage Repair Recording Feature***

The damage repair recording feature should first prompt the user to enter a description of the damage repair that was performed  (a String), as well as the repair cost to rectify the damage (a double).

Once these details have been entered the program should append the description supplied for the damage repair to the existing damage repair “list” (which will be a single String), as well as adding the cost of the damage repair to the running damage repair cost total.

ie. you should have a single String variable representing the damage repair “list”, to which each new damage repair entry will be appended (using concatenation or String.format()), and a single double variable to store the running damage repair cost total.

***Traffic Infringement Recording Feature***

The traffic infringement recording feature should prompt the user to enter a description of the traffic infringement (a String), as well as the fine that was charged on the infringement notice (a double)  

Once these details have been entered the program should append the details supplied for the traffic infringement to the existing traffic infringement “list” (which will be a single String), as well as adding the corresponding fine amount to the running traffic infringement fine total.

ie. you should have a single String variable representing the traffic infringement “list”, to which each new traffic infringement entry will be appended (using concatenation or String.format()), and a single double variable to store the running traffic infringement fine total.

***Final Hire Charge Calculation***

Once the user has selected the exit option from the menu the program should proceed to calculate the final hire charge as follows:

> final hire charge = adjusted hire charge + damage repair cost total + traffic infringement fines total

Once the calculations described above have been completed then the program should display updated care hire booking details to include the information shown in stages 1 and 2, as well as the new details regarding accident damage and traffic infringements that have occurred while the car was hired out by the customer and the final hire charge.

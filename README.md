# JJ-NumberAnalyzer
A small program that will analyze user integer input in order to give correct statistics of the numbers.

## Description
This is a basic program created and used for the purpose to get the user familiar with user input manipulation and validation. It gets a user to input a series of 10 integers within a given range in order to then tell them the average, highest, and lowest integer they entered into the program. However, if the user places an integer in the program that is outside of the specified boundaries, the code will flag it as invalid input and ask for a replacement. Once all ten integers are entered into the program, it will display the average, largest number, and lowest number.
### Features
This program has sever number analyzing features:
1. It keeps track of the running total throughout the runtime of the program
2. Once all ten integers are entered, it will display an average number to the user
3. For every number that is entered, the number enters a series of if statements that will determine if it is the new lowest or largest integer
4. Correctly displays the highest, lowest, and average number to the user

### Background
This program was created over the course of a day in order to complete a lab assignment in my CS 232 class. The most difficult process of creating this program was understanding how to set the boundaries of the user input, as well as using a do while loop to check on user input validation.

## Installation/Use
In order to use this code, you will need a Java Compiler (linked the Support section). From there you will be able to use one of two methods to access this code: 
1. If you are trained in accessing github files directly from your code, you may simply copy the link to my exact code files and run them from there.
2. If you are new to coding in Java, I recommend you simply:
    - Highlight all the code listed in my .java file
    - Right click
    - Left click "copy"
    - Enter your java file
    - Right click
    - Left click "paste"
3. For both methods make sure to save your file before compiling.

## Usage
1. Click compile and run on your IDE of choice
2. The computer will display a welcome message and ask the user to input a number between a certain range (default is 0-100)
    - if the user inputs an out of bounds digit, the program will flag it, display an error message and ask for another input
3. Once the computer has received ten integers from the user, it will begin the final piece of its code
4. The computer will display the smallest number entered
5. The computer will display the largest number entered
6. The computer will total and display the average of the user's input

## Customization
The user is able to customize two key elements of this program
* The input boundaries
    - To change these boundaries:
        1. Find the lines that read ((numberToUse <= 0) || numberToUse >= 101)
        2. Change the 0 to your lowest boundary
        3. Change the 101 to your highest boundary NOTE: The upper limit is exclusive, so if you put 100 in the parenthesis, the code will function between 0 and 99
        
* The number of integers to gather
    - To change this value
        1. Find the line that reads (int i = 0; i < 9; i++)
        2. Change the evaulation statement from 1 < 9, to whatever upper boundary your desire NOTE: The upper boundary will gather 1 more than the digit you enter, example: if your enter 9 then the program will gather 10 integers, enter 11 and the program will gather 12


## Support
If the code does not work as intended in the above segment please contact me at:
* blankblank@blankmail.com
* 111 111-1111

The IDE that I use to write, edit, and compile my code is located at: https://www.jetbrains.com/idea/

## Roadmap
There are several changes and additions I would like to add to this program:
1. I would like to add a feature that allows the user to exit the program early and still give them the analysis of the data already gathered
2. A feature that would give more of an analysis of the data
    - such as including: median, mode, and amount of prime numbers entered 
3. A re-run feature would allow a user to use the program multiple times before terminating, allowing easier user experience if they have more than a single set of number to analyze
4. Create a variable called "numbersToEnter" that way the program accomadates to the user's needs with every itteration
5. Create a variable called "lowerBound" and "upperBound" to help set the boundaries of the user's data without having to edit the code itself


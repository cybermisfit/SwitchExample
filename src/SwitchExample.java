import java.util.Scanner;

public class SwitchExample {

  /*  Write a program using a switch statement to print the month names given the exact number of days in the month.
    If the user enters 30 then the program will display: "September April June November". If the user enters 9 then
    program will alert the user that no months have exactly 9 days.
    You can have more than one statement in each switch case.*/

    public static void main(String[] args){


        Scanner keyboard = new Scanner(System.in);
        int monthName;
        System.out.print("Enter the number of days in a month (28, 30 or 31): ");
        monthName = keyboard.nextInt();

        switch (monthName) {
            case 28:
                System.out.println("February is the only month with 28 days...most years.");
                break;
            case 30:
                System.out.println("April, June, September, and November have 30 days.");
                break;
            case 31:
                System.out.println("January, March, May, July, August, October, and December have 31 days. ");
                break;

                default:
                    System.out.println("No months have the number of days requested.");


        }

        }







    }


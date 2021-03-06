import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //This program will print 'May' when you run it.
        int month = 5;
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Unknown";
                break;
        }
        System.out.println(monthName);
    }
}


//Switch statements
//The switch statement allows your program to offer selection among different cases. The switch statement works with byte (or Byte), short (or Short), char (or Character), int (or Integer) and Strings.
//
//The following code example declares an int named month whose value represents a month. The code displays the name of the month, based on the value of month.
//
//        //This program will print 'May' when you run it.
//        int month = 5;
//        String monthName;
//        switch (month) {
//            case 1:  monthName = "January";
//                     break;
//            case 2:  monthName = "February";
//                     break;
//            case 3:  monthName = "March";
//                     break;
//            case 4:  monthName = "April";
//                     break;
//            case 5:  monthName = "May";
//                     break;
//            case 6:  monthName = "June";
//                     break;
//            case 7:  monthName = "July";
//                     break;
//            case 8:  monthName = "August";
//                     break;
//            case 9:  monthName = "September";
//                     break;
//            case 10: monthName = "October";
//                     break;
//            case 11: monthName = "November";
//                     break;
//            case 12: monthName = "December";
//                     break;
//            default: monthName = "Unknown";
//                     break;
//        }
//        System.out.println(monthName);
//You could also display the name of the month with if-then-else statements. You will probably find the switch statement to be more intuitive. An if-then-else statement can test expressions based on ranges of values or conditions. A switch statement tests expressions based on a single value.
//
//Each break statement terminates the enclosing switch statement. The program continues after the break with the first statement following the switch block. Break statements are necessary. Without them, statements in switch blocks fall through. Statements after the matching case label are executed in sequence until a breakis encountered. Try removing the break statements.
//
//Your assignment
//Write a program using a switch statement to print the month names given the exact number of days in the month. If the user enters 30 then the program will display: "September April June November". If the user enters 9 then program will alert the user that no months have exactly 9 days.
//
//You can have more than one statement in each switch case.
//
//
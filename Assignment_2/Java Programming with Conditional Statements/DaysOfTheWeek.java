import java.util.Scanner;
public class DaysOfTheWeek {

    // main driver method
    public static void main(String[] args)
    {


 Scanner myObj = new Scanner(System.in);

    System.out.println("Day");



    // Numerical input
    int day= myObj.nextInt();
        
        String dayType;
        String dayString;

        // Switch case
        switch (day) {

        // Case
        case 1:
            dayString = "Monday";
            break;

        // Case
        case 2:
            dayString = "Tuesday";
            break;

            // Case
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }

        switch (day) {
            // Multiple cases without break statements

        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday";
            break;
        case 6:
        case 7:
            dayType = "Weekend";
            break;

        default:
            dayType = "Invalid daytype";
        }

        System.out.println(dayString + " is a " + dayType);
    }
}

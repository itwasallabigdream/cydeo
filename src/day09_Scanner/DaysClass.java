package day09_Scanner;

import java.util.Scanner;

public class DaysClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Write The Day Number :");
        int dayNumber = in.nextInt();
        String dayName = "Invalid";
        if ( dayNumber >= 1 &&  dayNumber <=7 )
        dayName = (1 == dayNumber) ? "Monday" : ((dayNumber == 2) ? "Tuesday" : ((dayNumber == 3) ? "Wensday"
                : ((dayNumber == 4) ? "Thursday" : ((dayNumber == 5) ? "Friday" : ((dayNumber == 6) ? "Saturday"
                : "Sunday")))));
        in.close();
        System.out.println(dayName);

    }
}

package day15_for_loop;

import java.util.Scanner;

public class WhileLoopPratctice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please Entre You age");
        int age = input.nextInt();
        String result = "Eligible";
       /* if (age <= 17 ) {
            result = "Not Eligible";
        }


 */

        while (age <= 17){
            System.out.println("please Entre Eligible Age: ");
             age = input.nextInt();
        }
        System.out.println(result);
    }


}

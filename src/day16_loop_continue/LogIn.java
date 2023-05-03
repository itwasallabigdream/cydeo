package day16_loop_continue;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Provide Your User Name: ");
        String user_name = input.next();
        System.out.println("Please Provide Your PassWord: ");
        String pass_word = input.next();

        if (user_name.equals("cydeo")   && pass_word.equals("WoodenSpoon")){
            System.out.println("Log In");
        }else {
            for (int i = 0 ; i <= 3 && !(user_name.equals("cydeo")  && pass_word.equals("WoodenSpoon")); i++){
                System.out.println(" Provide Your User Name: ");
                 user_name = input.next();
                System.out.println(" Provide Your PassWord: ");
                 pass_word = input.next();
            }
        }
    }
}

package exam;
import java.util.Scanner;


public class T1BasicCalculator {
    public static void main(String[] args) {
        double num1 = 1.80;
        double num2 = 2.80;
        /*
        String resualtmsg = "num1 = 1.80\nnum2 = 2.80";
        System.out.println(resualtmsg);
        double resualt = num1 + num2;
        System.out.println( num1 + "+" + num2 + "=" +  resualt);
        resualt = num1 - num2;
        System.out.println( num1 + "-" + num2 + "=" +  resualt);
        resualt = num1 * num2;
        System.out.println( num1 + "*" + num2 + "=" +  resualt);
        resualt = num1 / num2;
        System.out.println( num1 + "/" + num2 + "=" +  resualt);
        resualt = num1 % num2;
        System.out.println( num1 + "%" + num2 + "=" +  resualt);
        */

        Scanner input = new Scanner(System.in);
        System.out.println("plz write something");
        String read = input.next();
        System.out.println("this your writing" + read);
        input.close();
       /*
        switch (read){
            case '*':
                System.out.println( num1 + "*" + num2 + "=" +  resualt);
            break;
            case '+':
                System.out.println( num1 + "+" + num2 + "=" +  resualt);
            break;
            case '-':
                System.out.println( num1 + "-" + num2 + "=" +  resualt);
            break;
            case '%':
                System.out.println( num1 + "%" + num2 + "=" +  resualt);
            break;
           }
        */



    }
}

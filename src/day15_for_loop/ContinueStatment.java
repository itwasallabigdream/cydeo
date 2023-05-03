package day15_for_loop;

public class ContinueStatment {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 4) {
                continue;
            }
            System.out.println(i);
            System.out.println("This is " + i);

        }

        for (char i = 'A'; i < 'Z'; i++) {
            boolean my_name = i == 'S' || i == 'T' ||i == 'O' || i == 'U'|| i == 'F'|| i == 'I'|| i == 'A'|| i == 'N'|| i == 'E'|| i == 'D';
            if (my_name) {
                continue;
            }
            System.out.println(i);
        }
    }
}

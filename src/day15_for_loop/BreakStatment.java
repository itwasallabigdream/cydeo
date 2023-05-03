package day15_for_loop;

public class BreakStatment {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            if (i == 5){
                System.out.println("befor 5");
                break;
            }
        }

        for (int i = 'A'; i < 'Z'; i++) {

            if (i == 'S'){
                System.out.println("befor 5");
                break;
            }

        }
    }
}

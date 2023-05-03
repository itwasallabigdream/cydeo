package day27_access_modifiers;

public class TestCircleObj {
    public static void main(String[] args) {

        Circle c = new Circle(5.8);
        System.out.println(c);
        System.out.println(Circle.PI);
        Circle.printPiValue();
            }
}

package day27_access_modifiers;

public class Circle {
    public double radius , diameter;
    public static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }
    /*
    public static double calcArea(){
        return radius * radius * PI;
    }
    */
    public double calcArea(){
        return radius * radius * PI;
    }

    public double calcPerimeter(){
        return diameter * PI;
    }

    public static void printPiValue(){
        System.out.println("PI value is : "+ PI);
    }

    public String toString(){
        return "Circle{" +
                "radius=" + radius +
                "diameter=" + diameter +
                "PI=" + PI +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() ;
    }
}

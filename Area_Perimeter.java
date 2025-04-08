import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class Area_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Calculate Circle");
            System.out.println("2. Calculate Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("The area of the circle is: " + circle.area());
                    System.out.println("The perimeter of the circle is: " + circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the length of the Rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the Rectangle: ");
                    double width = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("The area of the Rectangle is: " + rectangle.area());
                    System.out.println("The perimeter of the Rectangle is: " + rectangle.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

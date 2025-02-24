
import java.util.Scanner;
class ComplexNumbers{
    double real,img;

    public ComplexNumbers(double real, double img) {
        this.real = real;
        this.img = img;
    }

    static  ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2){
        return new ComplexNumbers(c1.real+c2.real,c1.img+c2.img);
    }

    void display(){
        System.out.println(real+"+"+img+"i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real part of  first number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the img part of  first number:");
        double img1 = scanner.nextDouble();
        System.out.println("Enter the real part of  2nd number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the img part of  2nd number:");
        double img2 = scanner.nextDouble();

        ComplexNumbers c1 = new ComplexNumbers(real1,img1);
        ComplexNumbers c2 = new ComplexNumbers(real2, img2);

        ComplexNumbers sum = ComplexNumbers.add(c1, c2);
        System.out.println("The result is");
        sum.display();
        scanner.close();
    }
    
    


}
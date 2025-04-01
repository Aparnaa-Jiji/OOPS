import java.util.Scanner;

// Employee class
class Employee {
    int empId;
    String name;
    double salary;
    String address;

    // Constructor to initialize the data members of Employee
    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Teacher class that inherits from Employee
class Teacher extends Employee {
    String department;
    String subjectsTaught;

    // Constructor to initialize data members of Teacher
    Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        // Call the constructor of the parent class (Employee)
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Display function to display all data
    void display() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for Employee data
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // To consume the leftover newline character

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // To consume the leftover newline character

        System.out.print("Enter Employee Address: ");
        String address = scanner.nextLine();

        // Taking input for Teacher-specific data
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Subjects Taught: ");
        String subjectsTaught = scanner.nextLine();

        // Creating an object of Teacher class
        Teacher teacher = new Teacher(empId, name, salary, address, department, subjectsTaught);

        // Displaying teacher details
        teacher.display();
        
        // Close the scanner object to avoid memory leaks
        scanner.close();
    }
}


Output:
Enter Employee ID: 12
Enter Employee Name: Archana
Enter Employee Salary: 28000
Enter Subjects Taught: Maths

Employee ID: 12
Name: Archana
Salary: 28000.0
Address: Kottayam
Department: IT
Subjects Taught: Maths

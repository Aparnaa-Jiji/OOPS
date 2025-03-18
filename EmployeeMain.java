import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    int eSalary;

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        eNo = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Employee Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        eSalary = Integer.parseInt(sc.nextLine());
    }

    // Method to display employee name
    public void display() {
        System.out.println("Employee Name: " + eName);
    }
}

public class EmployeeMain {  // Class that contains the main method
    public static void main(String[] args) {
        int i, n = 3;
        int No;
        Employee emp[] = new Employee[n];

        // Read employee details
        for (i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read();
        }

        // Search loop
        System.out.println("Search");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee ID:");
            No = Integer.parseInt(sc.nextLine());

           
            for (i = 0; i < n; i++) {
                if (emp[i].eNo == No) {
                    emp[i].display();
                    break;
                }
            }
            
        }
    }
}

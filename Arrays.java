import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

       
        int[] arr = new int[size];

        
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

     
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

   
        boolean found = false;
        for (int i = 0; i < key; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Element " + key + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

   
        scanner.close();
    }
}

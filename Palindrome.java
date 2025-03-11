import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); 
        
        String rev = "";
        int len = str.length();
      for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (rev.toLowerCase().equals(str.toLowerCase())) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

     
        scanner.close();
    }
}


import java.util.Scanner;
public class SymmetricM{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of rows and columns:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        if(rows!=cols)
        {
            System.out.println("Rows and Columns are not same");
        
        }
        break;
        System.out.println("Enter the matrix values:");
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int flag = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]!=matrix[j][i])
                    flag=1;
            }
        
        }
        if(flag==1){
            System.out.println("Not a Symmetric Matrix");
        }
        else{
            System.out.println("Symmetric Matrix");
        }
        scanner.close();
    }
    

}


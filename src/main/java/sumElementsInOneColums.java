import java.util.Scanner;

public class sumElementsInOneColums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter Number Rows of Matrix:");
        rows = scanner.nextInt();
        System.out.println("Enter Number Cols of Matrix:");
        cols = scanner.nextInt();
        // Enter value for element
        int [][] matrix = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.println("Enter value for Element at row "+ (i+1) + ", col "+ (j+1) +" is: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        //Show matrix
        System.out.println("Matrix is:");
        for (int i=0; i<rows; i++){
            System.out.println(" ");
            for (int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }
        System.out.println(" ");
        //Sum numbers of one col
        int index;
        int sum = 0;
        System.out.println(" You want Sum Numbers of col :");
        index = scanner.nextInt();
        for (int i=0;i<rows;i++){
            sum += matrix[i][index-1];
        }
        //show sum
        System.out.println("Sum Numbers of col "+ index + " is: "+sum);
    }
}

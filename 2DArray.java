
import java.util.*; 
class TwoDArray {

       public static void main(String[] args)
       {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter number of matrix rows : ");
          int row = sc.nextInt();
          System.out.println("Please enter number of matrix columns : ");
          int col = sc.nextInt();
          // defining two dimensional array java
          int[][] numbers = new int[row][col];
          // fill java matrix
          fillMatrix(sc, numbers, row, col);
          // printing 2d array in matrix form in java
          printMatrix(numbers, row, col);
       }
       public static void fillMatrix(Scanner scan, int num[][], int rows, int columns)
       {
          System.out.println("Please enter elements in matrix : ");
          for(int a = 0; a < rows; a++)
          {
             for(int b = 0; b < columns; b++)
             {
                num[a][b] = scan.nextInt();
             }
          }
       }
       public static void printMatrix(int num[][], int rows, int columns)
       {
          System.out.println("Printing 2d array in matrix form : ");
          for(int a = 0; a < rows; a++)
          {
             for(int b = 0; b < columns; b++)
             {
                System.out.print(num[a][b] + "\t");
             }
             System.out.println();
          }
       }
    }
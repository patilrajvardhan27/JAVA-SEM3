import java.util.*;
 
public class array2d {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
 
       int[][] numbers = new int[rows][cols];
 
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
       System.out.println("enter number search =");
       int x =sc.nextInt();
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
            if(x == numbers[i][j]){

                System.out.println(i+" ,"+j);

            }
           }
               System.out.println();
           }
        }
    }
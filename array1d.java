import java.util.Scanner;

public class array1d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter size \n");
        int size = sc.nextInt();

        int[]numbers = new int[size];
        System.out.println("enter elements \n");
        for(int i=0;i<size;i++){
           numbers[i] = sc.nextInt();
        }
        System.out.println("enter element x -");
        int x = sc.nextInt();
        for(int i =0;i<size;i++){
        if(numbers[i]==x){
            System.out.println("x found at index -" + i);
        }
    }
    } 
}

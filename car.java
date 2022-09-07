import java.util.Scanner;
import java.util.Arrays;
public class car{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String []A=new String[6];
        int i=0;
        System.out.println("Enter Vehilcle's numberplates");
        while(i<5){
            A[i]=sc.nextLine();
        i++;
        };
        for (int k=0;i<10;i++){
            if(A[i].startsWith("TN23")){
                System.out.println("Car is not form vellore");
            } else {
                System.out.println(A[i]);
            }
        }
        Arrays.sort(A);
        for (int k=0;k<5;k++){
            System.out.println(A[k]);
        }
        
    }
}
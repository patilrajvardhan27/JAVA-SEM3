import java.util.Scanner;

public class CbsePercentageCalc {
    public static void main(String[] args) {
        
    

        int total = 500;

        System.out.println("Enter the marks of 5 subjects ");
        
        Scanner marks = new Scanner(System.in);

        int Subject_1 = marks.nextInt();

        int Subject_2 =marks.nextInt();

        int Subject_3 = marks.nextInt();

        int Subject_4 = marks.nextInt();

        int Subject_5 = marks.nextInt();

        float sum = Subject_1+Subject_2+Subject_3+Subject_4+Subject_5;
        System.out.print("The total marks are:  ");
        System.out.println(sum);

        System.out.println("The percentage is = ");

        float percentage = (sum/total)*100;
        
        System.out.println(percentage);

    
}
}

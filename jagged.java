import java.util.Scanner;

public class  jagged
{
    public static void main(String args[]) {
        final int TOTAL_STUDENTS = 4;
        Scanner in = new Scanner(System.in);
        
        String name[] = new String[TOTAL_STUDENTS];
        int s1[] = new int[TOTAL_STUDENTS];
        int s2[] = new int[TOTAL_STUDENTS];
        int s3[] = new int[TOTAL_STUDENTS];
        int s4[] = new int[TOTAL_STUDENTS];
        int s5[] = new int[TOTAL_STUDENTS];
        int s6[] = new int[TOTAL_STUDENTS];
        double p[] = new double[TOTAL_STUDENTS];
        char g[] = new char[TOTAL_STUDENTS];
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {

            System.out.println("Enter student " + (i+1) + " details:");
           
            System.out.print("Subject 1 Marks: ");
            s1[i] = in.nextInt();
            System.out.print("Subject 2 Marks: ");
            s2[i] = in.nextInt();
            System.out.print("Subject 3 Marks: ");
            s3[i] = in.nextInt();
            System.out.print("Subject 4 Marks: ");
            s4[i] = in.nextInt();
            System.out.print("Subject 5 Marks: ");
            s5[i] = in.nextInt();
            System.out.print("Subject 6 Marks: ");
            s6[i] = in.nextInt();
            
            
                    
            if (p[i] < 40)
                g[i] = 'F';
            
            else
                g[i] = 'P';
        }
        
        System.out.println();
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println( name[i] + "\t" 
            + p[i] + "\t"
            + g[i]);
        }
    }
}

    

import java.util.Scanner;

class area{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        int radius  = in.nextInt();
        float area = (float) (3.14*radius);
        System.out.println("The area of circle is " + area);
    }
    }




import java.util.Scanner;

class Mobile{

    Scanner sc = new Scanner(System.in);
    String name;
    int Ram;
    int price;
    String color;
    
    public  void setinput(){
        System.out.println("enter mobile name =");
        name =sc.nextLine();
        System.out.println("enter ram spec =");
        Ram =sc.nextInt();
        System.out.println("enter price =");
        price = sc.nextInt();
        System.out.println("enter color =");
        color = sc.next();
    }

    public void displayInfo(){
        System.out.println("then name of mobile is = " + name);
        System.out.println("the ram spec is = " + Ram);
        System.out.println("the price is = " + price);
        System.out.println("the color is = " + color);
    }
}

public class mobileme {
    public static void main(String[] args) {
        Mobile m1 =new Mobile();
        m1.setinput();
        m1.displayInfo();
    }    
}


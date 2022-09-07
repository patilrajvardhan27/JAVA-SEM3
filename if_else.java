import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String website = sc.next();
    
        if(website.endsWith(".com")){
            System.out.println("its a commercial website");
        }
    
        else if (website.endsWith(".org")){
            System.out.println("Its a organizational website");
        }
    
        else if(website.endsWith(".in")){
            System.out.println("Its a Indian website");
        }
    }
        
    }
  
import java.util.Scanner;

public class usernamePassword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username = ");
		String username = sc.nextLine();
        
        System.out.println("Enter Passoword of minimun 8 characters ");
        int PASSWORD_LENGTH = 8;
        String password = sc.nextLine();
        if (password.length() < PASSWORD_LENGTH) {
            System.out.println("Password strength less tha 8 chharacters");
        }
        else if(username.equals(password)){
            System.out.println("Password must not be equal to username ");
            
        }
        System.out.println("Confirm Password = ");
        String ConfirmPassword = sc.nextLine();
        if(!password.equals(ConfirmPassword)){
            System.out.println("The password is not matching");
        }
		
    }
}

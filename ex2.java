import java.util.Scanner;  
public class ex2 {     
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);          
        System.out.println("\nEnter Username: ");         
        String userName = sc.next();          
        System.out.println("\nEnter Password: ");         
        String password = sc.next();          
        System.out.println("\nConfirm your password: ");         
        String confirmPassword = sc.next();          
        // length() method of string returns number of characters in it.         
        if (userName.length() < 8) {             
        System.out.println("Invalid username length.");         } 
        else if (password.length() < 8) {             
            System.out.println("Invalid Password length.");         }         
            
            
            // String method equals() compares two string and return false if not equal         
            // otherwise return true         
            else if (password.equals(confirmPassword) == false) {             
                System.out.println("Passwords don't match");         } 
                else {             int flag = 0;            
                     for (int i = 0; i <= userName.length() - 3; i++) {                 
                        
                        String subPart = userName.substring(i, i + 3);                 
                        if (password.contains(subPart)) {                    
                             flag = 1;                     
                             System.out.println("Password cannot contain username.");                     
                             break;                
                             }             
                            }             
                            if (flag == 0) {                 
                                // flag is stil 0 means passwrord doesn't contain any 3 adjacent characters                
                                 // of userName.                 
                                 
                                 System.out.println("Every condition of username and password is satisfied");            
                                 }         
                                }      
                            } 
                        }

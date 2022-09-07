import java.util.Scanner;
/* 
public class main {
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
         */   
/* 
        
            public static void main(String[] args)  {
                
                Scanner sc = new Scanner(System.in);
                int N  = 2;
                for (int j = 0; j < 10; j++) {
                    int result;
                    result = N * j;
                    j++;
                    System.out.println(( "2 " + "x " +  j) +  " = "  + result);
                    
                }
                    
                
            }
        }*/
        
    


 



        class main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                int n,m,sum,sub,multi,divi;
                char o;
                System.out.println("Press '+' for addition '-' for subtraction '*' for multiplication '/' for division  ");
                
                do {
                    System.out.println("enter the operator");
                    o = sc.next().charAt(0);
                    System.out.println("ENTER FIRST NUMBER");
                    n = sc.nextInt();
                    System.out.println("ENTER SECOND NUMBER");
                    m = sc.nextInt();

        
                switch(o) {
        
                    case '+':
                        sum = n + m;
                        System.out.println("thr result is " + sum);
                        break;
        
                    case '-':
                        sub = n - m;
                        System.out.println("the result is" + sub);
                        break;
        
                    case '*':
                        multi = n * m;
                        System.out.println("the result is " + multi);
                        break;
                    case '/':
                        divi = n / m;
                        System.out.println("the result is " + divi);
                        break;

                    case 'Y' :
                        continue;
        
        
                    case'N' :
                    System.out.println("Bye...");
                    break;
                }
                
                System.out.println("Do you want to continue '(Y/N)'");
                char per = sc.next().charAt(0); 
                
        
                }while(true);
        }
    }

import java.util.Scanner;

class Account{
    double id,balance,annualIntrestRate,dateCreated;

    void Depost(double credit){
        balance = balance + credit;
    }

    public void Withdraw(double debit){
        balance -= debit;        
    }
    public void setinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id ");
        id = sc.nextDouble();

        System.out.println("enter annual intrest ");
        annualIntrestRate = sc.nextDouble();

        System.out.println("enter balance ");
        balance = sc.nextDouble();
    }

    public void display(){
        System.out.println(id + " " + balance + " " + annualIntrestRate);
    }
}

public class practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account();
        a1.setinput();
        System.out.println("\noperation \n1.withdraw \n2.deposit \n3.display");
        double deposit ;
        double withdraws;
        int c;
        c = sc.nextInt();
        do{
        if(c==1){
            System.out.println("anount to withdraw = ");
            withdraws =sc.nextDouble();
            a1.Withdraw(withdraws);
        }
        else if(c ==2){
            System.out.println("amount to deposit ");
            deposit = sc.nextDouble();
            a1.Depost(deposit);
        }
        else if(c==3){  
            a1.display();
        }
    }while(c != 0);
    sc.close();
    }
    
}

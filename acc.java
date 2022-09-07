import java.util.*;

class Account {
    Scanner in = new Scanner(System.in);
    double id, balance, annualIntrestRate;
    Date date = new Date();

    void display() {
        System.out.println("Id : " + id + "\nBalance : " + balance + "\nAnnual intrest : " + annualIntrestRate + "\nCreated on: " + date.toString());
    
    }

    void set() {
        System.out.print("Enter the id of the account :");
        id = in.nextDouble();
        System.out.print("Enter the balance of the account :");
        balance = in.nextDouble();
        System.out.print("Enter the Annual intrest rate : ");
        annualIntrestRate = in.nextDouble();
    }

    void deposit(Double creditAmt) {
        balance += creditAmt;
    }

    void withdraw(Double debitAmt) {
        balance -= debitAmt;
    }
}

class account_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account p1 = new Account();
        p1.set();
        double depAmt, withdrawAmt;
        int choice;
        do {
            System.out.println(" \noperation you want to do \n1.Withdraw \n2.Deposit \n3.Display \nEnter 0 to end");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("amount to withdraw : ");
                withdrawAmt = sc.nextDouble();
                p1.withdraw(withdrawAmt);
            } else if (choice == 2) {
                System.out.print("amount to deposit : ");
                depAmt = sc.nextDouble();
                p1.deposit(depAmt);
            } else if (choice == 3) {
                p1.display();
            }
        } while (choice != 0);
        sc.close();
    }
}
import java.util.Scanner;
interface Bank{
    public int Rate=12;
    public int Years=3;
    public void show();
}
class Customer{
    public String name;
    public int id;
    public void display(){
        System.out.printf("\n\n Bank Details\n\n");
        System.out.printf("Name - ");
        System.out.print(name);
        System.out.printf("\n\nId - %d",id);
    }
}
class Account extends Customer implements Bank{
    public String AccountNo;
    public int AccountBal;
    public int intrest(){
        return (AccountBal*Rate*Years)/1000;
    }
    public void show(){
        System.out.printf("\n\nAccount Number : ");
        System.out.print(AccountNo);
        System.out.printf("\n\nAccount Balance : %d",AccountBal);
        System.out.printf("\n\nInterest Rate : %d",intrest());
    }
}
class AccountDeatils extends Account{
    void set(String name, int id , String accountNo , int accountBal){
        this.name=name;
        this.id=id;
        this.AccountNo=accountNo;
        this.AccountBal=accountBal;
    }
}
public class bank
{
	public static void main(String[] args) {
		AccountDeatils obj = new AccountDeatils();
		obj.set("Jack Ma",1252,"XYZ-9373627584",1000000000);
		obj.display();
		obj.show();
	}
}
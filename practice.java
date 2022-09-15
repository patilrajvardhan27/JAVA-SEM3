import java.util.Scanner;

/* 
Account 
--------------------------------------
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
        double deposit ;
        double withdraws;
        int c;
        c = sc.nextInt();
        do{
            System.out.println("\noperation \n1.withdraw \n2.deposit \n3.display");
             c = sc.nextInt();
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
*/

// class Product{
//     String id,modelName,company,manufacDate;
//     int serialNo,price;


//     public void setinput(){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter company =");
//         company = sc.nextLine();

//         System.out.println("enter id =");
//         id = sc.nextLine();

//         System.out.println("enter name =");
//         modelName = sc.nextLine();

//         System.out.println("enter manfactureyear =");
//         manufacDate = sc.nextLine();

//         System.out.println("enter price =");
//         price = sc.nextInt();
//     }

//     public void display(){
//         System.out.println("company name =" + company );
//         System.out.println("id =" + id );
//         System.out.println("name =" + modelName );
//         System.out.println("manufacture year =" + manufacDate );
//         System.out.println("price =" + price );        
//     }
//     public void Samsungmanf(){
//     if(company.equals("Samsung")){
//         System.out.println("company name =" + company );
//         System.out.println("id =" + id );
//         System.out.println("name =" + modelName );
//         System.out.println("manufacture year =" + manufacDate );
//         System.out.println("price =" + price ); 
//     }   
//     }
//     public void manfactureyear() {
//         int i =Integer.parseInt(manufacDate);
//         if(i>2012 && i<2019){
//         System.out.println("company name =" + company );
//         System.out.println("id =" + id );
//         System.out.println("name =" + modelName );
//         System.out.println("manufacture year =" + manufacDate );
//         System.out.println("price =" + price ); 
//         }
//     }
//     public void Pricecomp() {
//         if(price>10000){
//         System.out.println("company name =" + company );
//         System.out.println("id =" + id );
//         System.out.println("name =" + modelName );
//         System.out.println("manufacture year =" + manufacDate );
//         System.out.println("price =" + price ); 
//         }
//         }
//         public void model() {
//             if(modelName.equals("laptop")){
//         System.out.println("company name =" + company );
//         System.out.println("id =" + id );
//         System.out.println("name =" + modelName );
//         System.out.println("manufacture year =" + manufacDate );
//         System.out.println("price =" + price ); 
//             }
            
//         }
// }


// public class practice {
//     public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
     
//     Product[] p1 = new Product[3];
    
//     for(int i=0;i<3;i++){
//         p1[i]=new Product();
//     }
//     for(int i=0;i<3;i++){
//         p1[i].setinput();
//     }
//     for(int i=0;i<3;i++){
//         p1[i].Samsungmanf();
//     }
//     for(int i=0;i<3;i++){
//         p1[i].manfactureyear();
//     }
//     for(int i=0;i<3;i++){
//         p1[i].Pricecomp();
//     }
//     for(int i=0;i<3;i++){
//         p1[i].model();
//         }
//     }
// }

public class practice {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of rows -");
        int r= sc.nextInt();

        System.out.println("enter no of coloums -");
        int c = sc.nextInt();

        int[][] a1 = new int [r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                a1[i][i] = sc.nextInt();
            }
        }
        sc.close();
                System.out.println("The Input array is :");
                for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                                System.out.print(a1[i][j] + "\t");
            }
        }
    }
       
}
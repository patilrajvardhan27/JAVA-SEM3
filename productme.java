import java.util.Scanner;

class Products{
    String id;
    String name;
    int serialNumber;
    String company;
    String manufactureDate;
    int price;

    public void setinput() {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter id =");
        id = sc.nextLine();
    
        System.out.println("enter name =");
        name = sc.nextLine();
    
        System.out.println("enter serial number =");
        serialNumber = sc.nextInt();
    
        System.out.println("enter company name =");
        company = sc.nextLine();
    
        System.out.println("enter manufacture Date =");
        manufactureDate = sc.nextLine();
    
        System.out.println("entr price =");
        price = sc.nextInt(); 
    }

    public void prodSamsumg() {
        if(company.equals("Samsung")){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial Number = %d\n",serialNumber);
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured Date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
        }     
    }
    public void manufactureYR() {
        int i = Integer.parseInt(manufactureDate.substring(manufactureDate.length()-4));
        if (2012<=i && i<=2019) {
            System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial Number = %d\n",serialNumber);
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured Date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
        }
        
        public void Prices(){
            if (price > 10000) {
                System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial Number = %d\n",serialNumber   );
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured Date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
                
            }
    }
    
}
    

public class productme {
    
}

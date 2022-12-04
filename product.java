import java.util.Scanner;
class Products{
    String id;
    String name;
    int serialnum;
    String company;
    String manufactureDate;
    int price;  
    public void setData(){
        Scanner sc=new Scanner (System.in);
        System.out.printf("Id = ");
        id=sc.next();
        System.out.printf("Name = ");
        name=sc.next();
        System.out.printf("Serial Number = ");
        serialnum=sc.nextInt();
        System.out.printf("Company = ");
        company=sc.next();
        System.out.printf("Manufacture date = ");
        manufactureDate=sc.next();
        System.out.printf("Price = ");
        price=sc.nextInt();
    }
    public void samsungManufactured(){
        if(company.equals("Samsung")){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial Number = %d\n",serialnum);
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured Date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
        }
    }
    public void manufacturedDate(){
        int i=Integer.parseInt(manufactureDate.substring(manufactureDate.length()-4));  
        if((2012<=i)&&(i<=2019)){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial Number = %d\n",serialnum);
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured Date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
        }
    }
    public void Price(){
        if(price>10000){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial Number = %d\n",serialnum);
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured Date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
        }
    }
    public void laptop(){
        if(name.equals("Laptop")){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("name = %s\n",name);
            System.out.printf("serial number = %d\n",serialnum);
            System.out.printf("company = %s\n",company);
            System.out.printf("manufactured date = %s\n",manufactureDate);
            System.out.printf("price = %d\n",price);
        }
    }
}
public class product
{
	public static void main(String[] args) {
		Products[] products = new Products[5];
		for(int i=0;i<5;i=i+1){
		    products[i] = new Products();
		}
		for(int i=0;i<5;i=i+1){
		    System.out.printf("\n\nProduct - %d -\n",i+1);
		    products[i].setData();
		}
		System.out.printf("\n\nProduct by Samsung - \n");
		for(int i=0;i<5;i=i+1){
		    products[i].samsungManufactured();
		}
		System.out.printf("\n\nManufactured between year 2012 and 2019 - \n");
		for(int i=0;i<5;i=i+1){
		    products[i].manufacturedDate();
		}
		System.out.printf("\n\n Price greater than 10000 - \n");
		for(int i=0;i<5;i=i+1){
		    products[i].Price();
		}
		System.out.printf("\n\nProduct which are Laptop - \n");
		for(int i=0;i<5;i=i+1){
		    products[i].laptop();
		}
	}
}*/
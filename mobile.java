import java.util.Scanner;
class Mobile{
    private String Name;
    private String Comapny;
    private double Price;
    private String manufactureYear;
    public void set_mobileDetails(){
        Scanner sc=new Scanner (System.in);
        System.out.printf("Model = ");
        Name=sc.next();
        System.out.printf("Company = ");
        Comapny=sc.next();
        System.out.printf("Price = ");
        Price=sc.nextDouble();
        System.out.printf("Manufacture year = ");
        manufactureYear=sc.next();
    }
    public static void sort_mobileDetails(Mobile[] mob){
        for(int i=0;i<5;i=i+1){
            for(int j=i+1;j<5;j=j+1){
                if(((mob[i].Comapny).compareTo(mob[j].Comapny))>0){
                    String a=mob[i].Name;
                    String b=mob[i].Comapny;
                    double c=mob[i].Price;
                    String d=mob[i].manufactureYear;
                    mob[i].Name=mob[j].Name;
                    mob[i].Comapny=mob[j].Comapny;
                    mob[i].Price=mob[j].Price;
                    mob[i].manufactureYear=mob[j].manufactureYear;
                    mob[j].Name=a;
                    mob[j].Comapny=b;
                    mob[j].Price=c;
                    mob[j].manufactureYear=d;
                }
            }
        }
    }
    public void display_mobileDetails(){
        System.out.printf("Name = %s\n",Name);
        System.out.printf("Company  = %s\n",Comapny);
        System.out.printf("Price = Rs %.2f\n",Price);
        System.out.printf("Manufacture year = %s\n",manufactureYear);
    }
}
public class mobile
{
	public static void main(String[] args) {
		Mobile[] mob = new Mobile[5];
		for(int i=0;i<5;i=i+1){
		    mob[i] = new Mobile();
		}
		for(int i=0;i<5;i=i+1){
		    System.out.printf("\n\nMobile %d ::\n",i+1);
		    mob[i].set_mobileDetails();
		}
		Mobile.sort_mobileDetails(mob);
		System.out.printf("\n\n** Sorted Order **\n");
		for(int i=0;i<5;i=i+1){
		    System.out.printf("\n\nMobile %d ::\n",i+1);
		    mob[i].display_mobileDetails();
		}
	}
}
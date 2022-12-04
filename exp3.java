import java.util.*;
class exception1 extends Exception{
    public String toString(){
        return ("\nInvalid length\n");
    }
}
class exception2 extends Exception{
    public String toString(){
        return ("\nInvalid reg No\n");
    }
}
class Student{
    private String id;
    private String name;
    private String year;
    public void getdata(String id,String name,String year){
        this.id=id;
        this.name=name;
        this.year=year;
    }
    public String getSchool(){
        return id;
    }
    public void details2018(){
        if(year.equals("2018")){
            System.out.printf("\nStudent id : ");
            System.out.print(id);
            System.out.printf("\nStudent Name : ");
            System.out.print(name);
        }
    }
    public void details2019(){
        if(year.equals("2019")){
            System.out.printf("\nStudent id : ");
            System.out.print(id);
            System.out.printf("\nStudent Name : ");
            System.out.print(name);
        }
    }
}
class   exp3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter the total number of students : ");
		int size=sc.nextInt();
		Student[] obj = new Student[size];
		for(int i=0;i<size;i=i+1){
		    obj[i] = new Student();
		}
		for(int i=0;i<size;i=i+1){
		    System.out.printf("\nEnter Student-%d Reg-Id : ",i+1);
		    String temp=sc.next();
		    boolean condition=true;
		    try{
		        if(temp.length()!=9){
		            condition=false;
		            throw new exception1();
		        }
		        else{
		            String st2=temp.substring(2,5);
		            if((st2.equals("BCE")==false)&&(st2.equals("BIT")==false)&&(st2.equals("BEE")==false)&&(st2.equals("BEC")==false)){
		                condition=false;
		            }
		            try{
		                if(condition==false){
		                    throw new exception2();
		                }
		                else{
		                    System.out.printf("\nEnter Name :");
		                    String temp1=sc.next();
		                    System.out.printf("\nEnter Year Of Joining :");
		                    String temp2=sc.next();
		                    obj[i].getdata(temp,temp1,temp2);
		                }
		            }
		            catch(Exception e){
		                System.out.print(e.toString());
		                i=i-1;
		            }
		        }
		    }
		    catch(Exception e){
               System.out.print(e.toString());
	            i=i-1;
		    }
		}
		System.out.printf("\nCount of the student from each School \n");
		int countA=0,countB=0,countC=0,countD=0;
		for(int i=0;i<size;i=i+1){
		    String temp=obj[i].getSchool();
		    String aux=temp.substring(2,5);
		    if(aux.equals("BCE")){
		        countA=countA+1;
		    }
		    else if(aux.equals("BIT")){
		        countB=countB+1;
		    }
		    else if(aux.equals("BEE")){
		        countC=countC+1;
		    }
		    else if(aux.equals("BEC")){
		        countD=countD+1;
		    }
		}
		System.out.printf("\nSchool \t Count\n");
		System.out.printf("\nSCOPE -\t %d\n",countA+countB);
		System.out.printf("\nSELCT -\t %d\n",countC);
		System.out.printf("\nSENSE -\t %d\n",countD);
		System.out.printf("\nStudent details from 2018 :: \n");
		for(int i=0;i<size;i=i+1){
		    obj[i].details2018();
		}
		System.out.printf("\n\nStudent details from 2019 :: \n");
		for(int i=0;i<size;i=i+1){
		    obj[i].details2019();
		}
	}
}
class Student{
    public
    String name;
    String regNo;
    int gpa;

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.regNo);
        System.out.println(this.gpa);
        
    }
}


public class CO {
public static void main(String[] args) {
    

    Student s1 =new Student();
    s1.name = "Raj";
    s1.regNo = "21BCI0056";
    s1.gpa = 8;

    s1.displayInfo();

}
}

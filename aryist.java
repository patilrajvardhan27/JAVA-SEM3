import java.util.*;
public class aryist {
 public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();
    //adding elements to aryist
    list.add("Audi");
    list.add("BMW");
    list.add("GC");
    list.add("Honda");
    list.add("Mercedese");
    //printing before sorting
    System.out.println("before sorting" + list);
    // sorting in ascending order alphabetically
    Collections.sort(list);
    System.out.println("After sorting" + list);

    //sorting list in ascending order by its length
    Collections.sort(list,Comparator.comparingInt(String::length));
    System.out.println("List After sorting by length" + list);

    //sorting list in descending order 
    Collections.sort(list,Comparator.comparingInt(String::length).reversed());
    System.out.println("descending order sorted list is" + list);


    
 }   
}

import java.util.*;   
public class arylist
{   
public static void main(String args[])   
{   
// creating object of ArrayList class  
ArrayList<String> list = new ArrayList<String>();   
// adding elements to the ArrayList   
list.add("Volkswagen");   
list.add("Toyota");   
list.add("Porsche");   
list.add("Ferrari");   
list.add("Mercedes-Benz");   
list.add("Audi");   
list.add("Rolls-Royce");  
list.add("BMW");  
// printing the unsorted ArrayList   
System.out.println("Before Sorting: "+ list); 
  
// Sorting ArrayList in ascending Order alphabetically
Collections.sort(list);     
System.out.println("After Sorting: "+ list);   
  
//  sorting String List in Ascending-order
Collections.sort(list, Comparator.comparingInt(String::length));
 
 
//  print ascending-order sorted Strings by its Length
System.out.println("\nAscending-order Sorted String List "
		  + "by its Length :- \n" + list + "\n");



//  sorting String List in Descending-order
Collections.sort(list, Comparator.comparingInt(String::length).reversed());


//  print descending-order sorted Strings by its Length
System.out.print("\nDescending-order Sorted String List "
		  + "by its Length :- \n" + list);

}   
}  
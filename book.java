class Book1

{

 String authorname, title1, publisher1;

 Book1(String aut, String title, String publ)

 {

  authorname = aut;

  title1 = title;

  publisher1 = publ;

 }

}

class BookDet extends Book1

{

 float price1;

 int stockpos;

 BookDet(String aut, String title, String pub1, float amt1, int set)

 {

  super(aut, title, pub1);

  price1 = amt1;

  stockpos= set;

 }

 void display()

 {

  System.out.println("Book Infromation:");

  System.out.println("Title - " + title1);

  System.out.println("Author - " + authorname);

  System.out.println("Publisher - " + publisher1);

  System.out.println("Price -" + price1);

  System.out.println("Remaining - " + stockpos);

 }

}

public class book
{

public static void main(String[] args) 

 {

  BookDet o1 = new BookDet("Peter thiel", "Zero to one", "ABC Publication", 200, 80);

  BookDet o2 = new BookDet("Ashlee Vance", "Elon Musk", "CDE Publication", 355, 1);

  BookDet o3 = new BookDet("Enid Blyton", "Famous Five", "Person Publication", 700, 25);

  o1.display();

  o2.display();

  o3.display();

 }

}
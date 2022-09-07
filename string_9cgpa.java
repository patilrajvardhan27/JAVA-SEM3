import java.util.Scanner;
public class string_9cgpa
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] array = new String[5];

    System.out.println("Please enter 5 names ");

    for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextLine();
    }

    boolean count = false;
    System.out.println("Enter name to search ");
    String x = sc.nextLine();
for(int i = 0; i < array.length; i++)
{
    if(array[i].equals(x))
    {
        count = true;
        break;
    }
}
if(count)
{
    System.out.println("Name is 9 pointer");
}
else
{
    System.out.println("Name is not 9 pointer");
}
}
}
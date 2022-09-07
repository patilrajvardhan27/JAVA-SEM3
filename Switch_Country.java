import java.util.Scanner;

public class Switch_Country {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Country");
        String Country = sc.nextLine();
    

    switch (Country) {
        case "India": 
            System.out.println("Currency - Rupees");
            break;

            case "USA":
            System.out.println("Currency - USA Dollars");
            break;

            case "Japan":
            System.out.println("Currency - Japanese yen");
            break;

            case "UK":
            System.out.println("Currency - Pound Sterling");
            break;

            case "Vietnam":
            System.out.println("Currency - Vietnamese dong");
            break;

            case "Malasiya":
            System.out.println("Currency - Malaysian ringgit");
            break;

            default:
            System.out.println("Country's name is invalid");
            break;
    }
    
}
}
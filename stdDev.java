import java.util.Scanner; 

public class stdDev {

    public static void main(String[] args) {
        int n;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  

        //reading the number of elements from the that we want to enter  

        n=sc.nextInt();  
        //creates an array in the memory of length 10  

        double [] numArray = new double[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
    //reading array elements from the user   
    numArray[i]=sc.nextInt();  
}  
        double SD = calculateSD(numArray);

        System.out.format("Standard Deviation = %.6f", SD);
    }

    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
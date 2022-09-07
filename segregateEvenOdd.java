import java.util.Scanner; 
class SegregateOddEven
{
    static void segregateEvenOdd(int arr[])
    {
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0 && left < right)
                left++;
 
            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1 && left < right)
                right--;
 
            if (left < right)
            {
                /* Swap arr[left] and arr[right]*/
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
 
    /* Driver program to test above functions */
       public static void main(String[] args) {
            int n;  
            Scanner sc = new Scanner(System.in);  
            System.out.print("Enter the number of elements you want to store: ");  
    
            //reading the number of elements from the that we want to enter  
    
            n=sc.nextInt();  
            //creates an array in the memory of length 10  
    
            int [] numArray = new int[10];  
            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<n; i++)  
            {  
        //reading array elements from the user   
        numArray[i]=sc.nextInt();  
    } 
 
        segregateEvenOdd(numArray);
 
        System.out.print("Array after segregation ");
        for (int i = 0; i < numArray.length; i++)
            System.out.print(numArray[i]+" ");
    }
}

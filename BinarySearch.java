import java.util.*;

public class BinarySearch
{
    public static void main(String[] args) {
    
        Scanner sc  = new Scanner(System.in);

        int n=0, ele;
        
        System.out.println("Enter the size of array");

        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array");

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search");

        ele = sc.nextInt();
        
        System.out.println("Array found at index "+Search(arr, ele));
    }

    public static int Search(int arr[], int ele)
    {
        int mid=0;

        int low=0, high = arr.length-1;

        while(low<=high)
        {
            mid = low + (high-low)/2;

            if(arr[mid] == ele)
            {
                return mid; 
            }

            else if(arr[mid]<ele)
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}

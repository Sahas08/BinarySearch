import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class AgnosticBinarySearch 
{
    
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int n, ele;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the elements of sorted array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched");
        ele = sc.nextInt();

        if(arr.length==1)
        {
            if(arr[0]==ele)
            {
                System.out.println("Element found at index: 0");
            }
            else
            {
                System.out.println("Element found at index: -1");
            }
        }

        else if(arr[0]<arr[1])
        {
            System.out.println("Element found at index: "+AscendingSort(arr,ele));
        }
        else 
        {
            System.out.println("Element found at index: "+DescendingSort(arr,ele));
        }
    }

    public static int AscendingSort(int arr[], int ele)
    {
        int low = 0;
        int high = arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr[mid]==ele)
            {
                return mid;
            }
            else if(arr[mid]>ele)
            {
                high = mid-1;
            }
            else 
            {
                low = mid+1;
            }
        }
        return -1;
    }

    public static int DescendingSort(int arr[], int ele)
    {
        int low = 0 ;
        int high = arr.length-1;
        int mid = 0;

        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr[mid]==ele)
            {
                return mid;
            }
            else if(arr[mid]>ele)
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

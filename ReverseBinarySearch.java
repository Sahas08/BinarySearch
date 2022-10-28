import java.util.*;

public class ReverseBinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=0;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in descending order");
        for(int i=0; i<size; i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int ele = sc.nextInt();
        
        System.out.println("Element found at index: "+Search(arr,ele));
    }
    
    public static int Search(int arr[], int ele)
    {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(low<=high)
        {
        
        	mid = low + (high-low)/2;
        	if(arr[mid] == ele)
        	{
        	    return mid;
        	}
        	else if(arr[mid] < ele)
        	{
        	    high = mid - 1;	
        	}
        	else
        	{
        	    low = mid + 1;
        	}
        }
        
        return -1;
    }
}

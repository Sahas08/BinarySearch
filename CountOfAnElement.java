import java.util.*;

public class CountOfAnElement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int firstOccurence=0, lastOccurence=0;

        int result = 0;

        int n, ele;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the elements of sorted array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be counted");
        ele = sc.nextInt();

        firstOccurence = FirstOccurence(arr, ele);
        lastOccurence = LastOccurence(arr, ele);

        System.out.println("The count of "+ele+" is "+(lastOccurence-firstOccurence+1));

    }

    public static int LastOccurence(int arr[], int ele)
    {
        int index = 0, low = 0, high = arr.length-1;
        int mid = 0;

        while(low<=high)
        {
            mid = low + (high - low)/2;
            if(arr[mid]==ele)
            {
                index = mid;
                low = mid + 1;
            }  

            else if(arr[mid] > ele)
            {
                high = mid - 1;
            }

            else 
            {
                low = mid + 1;
            }
        }
        return index;
    }

    public static int FirstOccurence(int arr[], int ele)
    {
        int low = 0, high = arr.length-1;
        int mid = 0;
        int index=0;

        while(low<=high) // low < high
        {
            mid = low + (high-low)/2;

            if(arr[mid]==ele)
            {
                index = mid;
                high = mid - 1;
            }

            else if(arr[mid]>ele)
            {
                high = mid - 1;
            }

            else
            {
                low = mid + 1;
            }
        }
        return index;
    }

}

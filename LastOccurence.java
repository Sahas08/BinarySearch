import java.util.*;

public class LastOccurence {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, ele;

        System.out.println("Enter the size of the array");
        n = sc.nextInt();

        System.out.println("Enter the sorted array");
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search");
        ele = sc.nextInt();

        System.out.println("The last occurence of "+ele+" is  "+LastOccurence(arr,ele));

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

}

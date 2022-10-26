import java.util.*;

public class FirstOccurence {
    
    public static void main(String[] args) {
        
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

        System.out.println("First occurence is at index: "+FirstOccurence(arr,ele));

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

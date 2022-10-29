import java.util.*;

public class RotationCount {
    
    public static void main(String[] args) {
        
        int[] arr = {2,3,4,5,1};

        System.out.println(arr.length-NumberOfRotations(arr));

    }

    public static int NumberOfRotations(int[] arr)
    {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int index = 0;

        if(arr.length==1)
            return 1;

        else

        while(low<=high)
        {
            mid = low + ((high-low)/2);

            if((arr[mid] >= arr[mid-1]) && arr[mid]<=arr[mid]+1)
            {
                index = mid;
                low = mid-1;
            }

            else 
            {
                index = mid;
                high = mid+1;
            }
        }

        return index;
    }
}

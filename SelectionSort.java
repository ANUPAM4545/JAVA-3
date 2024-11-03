import java.util.Arrays;

public class SelectionSort {
    static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small=arr[i];
            int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(small>arr[j]){
                   small=arr[j];
                   idx=j;
                }
            }
            int extra=arr[i];
            arr[i]=arr[idx];
            arr[idx]=extra;

        }

    }
    public static void main(String[] args) {
        int arr1[]={5,4,3,2,1};
        System.out.println("Before sorting: "+ Arrays.toString(arr1));
        selection(arr1);
        System.out.println("After sorting: "+Arrays.toString(arr1));
        
    }
}


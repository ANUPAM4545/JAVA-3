import java.util.Arrays;
public class BubbleSort {
    static void bubble(int []arr){
       for(int i=0;i<arr.length-1;i++){
          for(int j=0;j<arr.length-1-i;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
          }
       }
    }
    public static void main(String[] args) {
        int arr1[]={5,4,3,2,1};
        System.out.println("Before sorting: "+ Arrays.toString(arr1));
        bubble(arr1); 
        System.out.println("After sorting: "+Arrays.toString(arr1));
    }
}

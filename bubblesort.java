import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,23,7};
        bubblesortt(arr,5,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesortt(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
         bubblesortt(arr, r, c+1);
            }else{
                 bubblesortt(arr, r-1, 0);
            }
        
    }
}

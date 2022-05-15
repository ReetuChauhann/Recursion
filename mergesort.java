import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        int[] aar=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        int start=0;
        int end=arr.length-1;
         
        int m=arr.length/2;

        int[] left=mergesort(Arrays.copyOfRange(arr, start, m));
        int[] right=mergesort(Arrays.copyOfRange(arr, m, end));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        if(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        if(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
    return mix;
    }
}

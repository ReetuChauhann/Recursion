public class Bsearch {
    public static void main(String[] args) {
        int[] arr = {12,14,15,77,89};
        int target=14;
        int start=0;
        int end=arr.length-1;
        int ans=binaerSearch(arr,target,start,end);
        System.out.println(ans);
    }
    static int binaerSearch(int[] arr, int target, int start, int end){

        if(start>end){
            return -1;
        }
        int m = start+(end-start)/2;
        if(target==arr[m]){
            return m;
        }
        if(target<arr[m]){
            return binaerSearch(arr, target, start, m-1);// always return if callin function has the return type
        }else{
            return binaerSearch(arr, target, m+1, end);
        }
        
    }
    
}

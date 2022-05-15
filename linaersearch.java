public class linaersearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int target=3;
        int ans=linearS(arr,3,0);
        System.out.println(ans);
    }
    static int linearS(int[] arr,int target, int index){
        if(index==arr.length){
            return-1;
        }
        if(target==arr[index]){
            return index;
        }else{
            return linearS(arr,target,index+1);
        }

    }
}

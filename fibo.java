public class fibo{
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n){
        if(n<2){ // this is my base conditon frm where it wont make any further calls it will jst return the controls or flow to the 
            return n;
        }
        return fibo(n-1)+fibo(n-2);  // caliing is take place
    }
}
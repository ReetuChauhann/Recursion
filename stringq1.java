public class stringq1 {
    public static void main(String[] args) {
        String up="bbadac";
        String  p="";
        String ans=fun(p, up);
        System.out.println(ans);

    }

    static String fun(String p, String up){
        if(up.isEmpty()){
           // System.out.println(p);
            return p;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return fun(p, up.substring(1));
        }else{
            return fun(p+ch, up.substring(1));
        }
    }
    
}

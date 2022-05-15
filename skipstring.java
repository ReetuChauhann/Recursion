public class skipstring {
    public static void main(String[] args) {
        String up= "abbapplebba";
        String p="";
        skipstring(p, up);
    }

    static void skipstring(String p,String up){
        if(up.isEmpty()){
             System.out.println(p);
             return;
        }

        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            skipstring(p,up.substring(5));
        }else{
            skipstring(p+ch,up.substring(1));
        }
    }
}

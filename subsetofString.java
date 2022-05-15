public class subsetofString {
    public static void main(String[] args) {
        String up="abc";
        String p="";
        subset(p, up);
        
    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return ;
        }
        char ch = up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }
}

public class skipapp {
    public static void main(String[] args) {
        //String up="abbapplebba";
        String up="abbappbba";
        String p="";
        fun(p, up);
    }
    static void fun(String p, String up){
      if(up.isEmpty()){
          System.out.println(p);
          return;
      }
      char ch=up.charAt(0);
      if( up.startsWith("app")   && !up.startsWith("apple")){
          fun(p, up.substring(3));
      }else{
          fun(p+ch, up.substring(1));
      }
    }
}

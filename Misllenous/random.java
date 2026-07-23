import java.util.HashMap;

public class random {

    public static String first(String s){
        HashMap<Character,Integer>map= new HashMap<>();
         for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
         }

         for(char c: s.toCharArray()){
            if(map.get(c)==1){
                return String.valueOf(c);
            }
         }
          return null;
    }
    public static void main(String[] args) {
         String s="SIWSS";
         System.out.println(first(s));
         
    }
}
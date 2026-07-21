public class ReverseString {

    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while (start<=end) {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }


    
    public static void main(String[] args) {
        char []str={'h','e','l','l','o'};
        System.out.println(str);
        reverseString(str);
        System.out.println(str);
        String name="Satvik";
        String ans="";
        for(int i=name.length()-1;i>=0;i--){
            ans+=name.charAt(i);
        }
        System.out.println(ans);
        StringBuilder strb= new StringBuilder(name);
        strb.reverse();
        System.out.println(strb.toString());



    }
}

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsString {

    public String reverseWords(String s) {
        return null;
    }

    public static void main(String[] args) {
        String s="the sky is blue";
        String [] ans=s.trim().split("\\s+");
        int start=0;
        int end =ans.length-1;
        while (start<end) {
            String st=ans[start];
            ans[start]=ans[end];
            ans[end]=st;  
            start++;



            end--;
        }
    System.out.println(String.join(" ", ans));
    
        
    }

}

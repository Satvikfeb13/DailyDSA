import java.util.HashMap;

public class StringCompression {

    public static int compress(char[] chars) {
        // if(chars.length==1){
        //     return 1;
        // }
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (Character ch : chars) {
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // StringBuilder str = new StringBuilder();
        // int i=0;
        // for (Character c : map.keySet()) {
        //     str.append(c);
        //     chars[i]=c;
        // }
        // for (Integer c : map.values()) {
        //     chars[i]=c;
        //     str.append(c);
        // }
        // System.out.println(str.length());

        return 0;
    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'a','b', 'b', 'c', 'c', 'c' };
        // System.out.println(compress(ch));
StringBuilder str = new StringBuilder();
int i = 0;
int j = 0;

while (j < ch.length) {
    // Move j until the character changes
    while (j < ch.length && ch[i] == ch[j]) {
        j++;
    }
    // Append the character
    str.append(ch[i]);
    // Append the count only if greater than 1
    if (j - i > 1) {
        str.append(j - i);
    }
    // Move to the next group
    i = j;
}
        System.out.println(str.length());
    }
}

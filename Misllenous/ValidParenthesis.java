// package Misllenous;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isvalid(String data) {
        boolean ans = true;
        Stack<Character> stack = new Stack<>();
        for (Character c : data.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char poper = stack.pop();
                if (poper == '[' && c != ']')
                    return false;
                if (poper == '{' && c != '}')
                    return false;
                if (poper == '(' && c != ')')
                    return false;

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isvalid(")"));

    }
}

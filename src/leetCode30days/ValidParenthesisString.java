package leetCode30days;

import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {

        String test = "(*)";
        System.out.println(checkValidString(test));
        
    }

    public static boolean checkValidString(String s) {

        if (s == null || s.length() < 1) {
            return true;
        }
        Stack<Integer> leftParenthesis = new Stack<Integer>();
        Stack<Integer> stars = new Stack<Integer>();
        
        for (int i=0 ; i< s.length() ; i++)
        {
            if (s.charAt(i) == '(')
                leftParenthesis.push(i);
            else if (s.charAt(i) == '*')
                stars.push(i);
            else if (s.charAt(i) == ')')
            {
                if (!leftParenthesis.empty())
                    leftParenthesis.pop();
                else if (!stars.empty())
                    stars.pop();
                else
                    return false;
            }

        }

        if (leftParenthesis.size() > stars.size()) {
            return false;
        }
        while (!leftParenthesis.isEmpty() && !stars.isEmpty()) {
            if (leftParenthesis.pop() > stars.pop()) {
                return false;
            }
        }
       
        return true;
     
        
    }
}
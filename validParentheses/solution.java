package validParentheses;

import java.util.HashMap;
import java.util.Stack;

public class solution {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        var parenthesesDic = new HashMap<Character, Character>();
        parenthesesDic.put(')','(');
        parenthesesDic.put(']','[');
        parenthesesDic.put('}','{');
        var inputStack = new Stack();
        for (char c: s.toCharArray())
        {
            if (parenthesesDic.containsValue(c))
                inputStack.push(c);
            else
            {
                if (inputStack.size() == 0)
                    return false;
                if (inputStack.peek() == parenthesesDic.get(c))
                    inputStack.pop();
                else
                    return false;
            }
        }
        return inputStack.isEmpty();
    }
}

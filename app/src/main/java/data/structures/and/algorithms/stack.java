package data.structures.and.algorithms;

import java.util.Stack;

public class stack {

    public  boolean BracketsBalanced(String Expression) {

        Stack<Character> main = new Stack <Character>();

        for (int i = 0; i < Expression.length(); i++) {
            char x = Expression.charAt(i);

            if (x == '(' || x == '{' || x == '[') {

                main.push(x);
                continue;

            }


            if (main.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = (char) main.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = (char) main.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = (char) main.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;


            }


        }
        return main.isEmpty();
    }
}

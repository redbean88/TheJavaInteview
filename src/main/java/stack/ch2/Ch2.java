package stack.ch2;

import java.util.Stack;

public class Ch2 {
    /**
     * 주어진 수식의 좔호짝이 맞는지 확인 하는 코드를 작성하라
     * 예 [] => True
     *    [ => False
     * 난이도 : 쉬움
     * 공부할것
     * 1.여는 괄호가 주어지면 닫는 괄호 위치를 확인하라
     * 2.괄호 몇개를 뒤집어야 정상적인 수식을 만들 수 있는지 확인하라
     * 3.불필요한 괄호가 있는지 확인하라
     */
    public static void main(String[] args) {
        Ch2 ch2 = new Ch2();
        System.out.println(ch2.solution("[[]]"));
        System.out.println(ch2.solution("[[]"));
    }


    private boolean solution(String mathExpresion){

        Stack<Character> brackets = new Stack<>();
        char[] chars = mathExpresion.toCharArray();

        for (char aChar : chars) {
            switch (aChar){
                case '(':
                case '{':
                case '[':
                    brackets.push(aChar);
                    break;
                case ')':
                    if(brackets.isEmpty() || brackets.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(brackets.isEmpty() || brackets.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(brackets.isEmpty() || brackets.pop() != '['){
                        return false;
                    }
                    break;
            }
        }

        return brackets.isEmpty();
    };
}

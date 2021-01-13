package stack.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Ch3_2 {
    /**
     * 인픽스를 포스트픽스로 변환하기
     * tip
     * 연산자를 스택을 이용한다
     */
    public static void main(String[] args) {
        Ch3_2 ch3_2 = new Ch3_2();

        System.out.println(ch3_2.solution("2+2*(5-7)"));
    }

    private int process(Character c){

        if(c == '*' || c == '/'){
            return 2;
        }else if(c == '+' || c == '-'){
            return 1;
        }
        return 0;
    }

    private String solution(String infix) {

        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
             Character target = infix.charAt(i);
             if(Character.isDigit(target)){
                postfix += target;
             }else if(target == '('){
                 stack.push(target);
             }else if(target == ')'){
                 while (!stack.isEmpty() && stack.peek() !='('){
                     postfix += stack.pop();
                 }
                 stack.pop();
             }else{
                 if(!stack.isEmpty() && process(target) < process(stack.peek())){
                    postfix += stack.pop();
                 }
                 stack.push(target);
             }
        }

        while (!stack.isEmpty()){
            postfix += stack.pop();
        }

        return postfix;
    }

}

package stack.ch3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 포스트픽스로 주어진 식을 계산하는 코드를 작성하라. 수신은 사칙연산('+','-','/','*') 만 사용
 * @TODO
 * 인픽스를 포스트픽스로 변환하기
 * 포스트픽스를 인픽스로 변환하기
 * 인픽스를 프리픽스로 변환하기
 * 프리픽스를 인픽스로 변환하기
 * 프리픽스를 포스트픽스로 변환하기
 * 포스트픽스를 프리픽스로 변환하기
 */
public class Ch3 {
    public static void main(String[] args) {

        Ch3 ch3 = new Ch3();
        System.out.println(ch3.solution2("12+"));
        System.out.println(ch3.solution2("123+-5*"));

    }

    /**
     * 시간 복잡도 : O(n)
     * 공간 복잡도 : O(n)
     */
    private int solution(String s) {
        Stack<Integer> numbers = new Stack<>();
        char[] chars = s.toCharArray();
        List<Character> operators = Arrays.asList('+','-','/','*');
        for (char aChar : chars) {
            if (operators.contains(aChar)){
                Integer second = numbers.pop();
                Integer first = numbers.pop();
                Integer result =0;
                switch (aChar){
                    case '+':
                        result = first + second;
                        break;
                    case '-':
                        result = first - second;
                        break;
                    case '/':
                        result = first / second;
                        break;
                    case '*':
                        result = first * second;
                        break;
                }
                numbers.push(result);
            }else{
                numbers.push(Integer.parseInt(String.valueOf(aChar)));
            }
        }


        return numbers.pop();
    }

    /**
     * 시간복잡도 O(n)
     * 공간복잡도 O(n)
     */
    public int solution2(String postfix){
        postfix = postfix.trim();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if(Character.isDigit(c)){
                list.push(c-'0');
            }else{
                Integer second = list.pop();
                Integer first = list.pop();
                switch (c){
                    case '+':
                        list.push(first + second);
                        break;
                    case '-':
                        list.push(first - second);
                        break;
                    case '/':
                        list.push(first / second);
                        break;
                    case '*':
                        list.push(first * second);
                        break;
                }
            }

        }
        return list.pop();
    }
}

package stack.intro;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class intro {
    public static void main(String[] args) {
        /**
         * statck 동기화 처리가 되어있어 속도가 deque에 비해 느림
         */
//        Stack<Integer> numbers = new Stack<Integer>();
        Deque<Integer> numbers = new LinkedList<Integer>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println(numbers.peek());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());

    }
}

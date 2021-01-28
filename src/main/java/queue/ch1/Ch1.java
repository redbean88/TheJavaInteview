package queue.ch1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch1 {
    /**
     * 큐를 뒤집어라
     */
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        System.out.println(numbers);

        Ch1 ch1 = new Ch1();
        Queue<Integer> reverseQueue =ch1.solution2(numbers);
        System.out.println(reverseQueue);
    }

    /**
     * 시간 복잡도 : O(n)
     * 공간 복잡도 : O(n)
     * @param numbers
     * @return
     */
    private Queue<Integer> solution(Queue<Integer> numbers) {
        Stack<Integer> stack = new Stack<>();

        Queue<Integer> reverse = new LinkedList<>();
        while (!numbers.isEmpty()){
            stack.push(numbers.poll());
        }
        while (!stack.isEmpty()){
            reverse.offer(stack.pop());
        }
        return reverse;
    }

    private Queue<Integer> solution2(Queue<Integer> numbers) {

        if(numbers.isEmpty()){
            return numbers;
        }

        int front = numbers.poll();
        numbers = solution2(numbers);
        numbers.offer(front);
        return numbers;
    }

}

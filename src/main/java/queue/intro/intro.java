package queue.intro;

import java.util.ArrayDeque;
import java.util.Queue;

public class intro {
    /**
     * Enqueue : 삽입
     * Dequeue : 제거
     */
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>(); // Deque ( Double Ended Queue )
        /**
         * 삽입
         */
        numbers.add(1);        // 큐삽입 실패시 예외를 던짐
        numbers.offer(2);   // 삽입 실패시, 예외 미발생
        /**
         * 제거
         */
        numbers.remove();       // 제거 실패시 예외를 던짐
        numbers.poll();         // 제거 실패시, 예외 미발생
        /**
         * 확인
         */
        numbers.element();      // 최상단 큐 확인 ,예외를 던짐
        numbers.peek();         // 최상단 큐 확인 ,예외 미던짐

    }
}

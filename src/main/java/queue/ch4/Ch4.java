package queue.ch4;

import java.util.LinkedList;
import java.util.Queue;

public class Ch4 {
    /**
     * 큐를 사용해서 스택을 구현하라
     * tip : 두개의 큐를 이용한다
     */

    public static void main(String[] args) {
        Ch4 ch4 = new Ch4();
        ch4.push(1);
        ch4.push(2);
        ch4.push(3);
        ch4.push(4);

        System.out.println(ch4.pop() == 4);
        System.out.println(ch4.pop() == 3);
        System.out.println(ch4.pop() == 2);
        System.out.println(ch4.pop() == 1);
    }

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    private int pop() {
        while (q1.size() > 1){
            q2.offer(q1.poll());
        }

        int result = q1.poll();


        /**
         * q1은 비어있는 상태 이기 때문에, new 생성자로 생성하지 않고 q2를 비우기 위해 swap 한다
         */
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return result;
    }

    private void push(int number) {
        q1.offer(number);
    }

}

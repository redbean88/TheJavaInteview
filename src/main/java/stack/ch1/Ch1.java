package stack.ch1;

import java.util.Stack;

public class Ch1 {
    /**
     * 스택을 뒤집는 코드를 작성하라
     * 난이도 : 보통
     * 다른 자료 구조 사용 여부 확인 필요
     * point : 다른 자료 구조를 사용하지 말고, 재귀적으로 처리 할것
     */
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        System.out.println(numbers);
        Ch1 ch1 = new Ch1();
        Stack<Integer> result = ch1.solution(numbers);
        System.out.println(result);
    }

    /**
     * 시간 복잡도
     * O(n)
     * 공간복잡도
     * O(n)
     */
    private Stack<Integer> solution(Stack<Integer> stack) {
        Stack<Integer> reversed = new Stack<>();
        while (!stack.isEmpty()){
            reversed.push(stack.pop());
        }
        return reversed;
    }

    /**
     * 시간 복잡도
     * O(n^2)
     * 공간복잡도
     * O(n)
     */
    private void solution2(Stack<Integer> stack) {
        if(stack.isEmpty()) return;
        int temp = stack.pop();
        solution2(stack);
        insertAtBottom(stack , temp);

    }

    private void insertAtBottom(Stack<Integer> stack , int number){
        if(stack.isEmpty()){
            stack.push(number);
        }else{
            int temp = stack.pop();
            insertAtBottom(stack,number);
            stack.push(temp);
        }
    }

}

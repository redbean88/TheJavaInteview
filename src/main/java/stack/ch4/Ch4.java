package stack.ch4;

import java.util.Arrays;
import java.util.Stack;

public class Ch4 {
    /**
     * 주어진 배열 prices에 대한 스팬을 구하는 코드를 작성하가.
     * 스팬: 당일의 주가보다 낮거나 같았던 연속적인 일수
     * key : 연속적인
     * key2 : stack은 인덱스를 저장 한다
     */
    public static void main(String[] args) {
        Ch4 ch4 = new Ch4();
        System.out.println(Arrays.toString(ch4.solution(new int[]{5,3,2,4,6,1})));
    }

    /**
     * 시간복잡도 : O(n)
     * 공간복잡도 : O(n)
     * @param price
     * @return
     */
    private int[] solution(int[] price) {
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<Integer>();
        // 0번 인덱스 값 설정
        span[0] = 1;        // 초기값은 자신보다 작은 값이 없다.
        stack.push(0);

        for (int i = 1; i < span.length; i++) {

            while (!stack.isEmpty() && price[i] >= price[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}

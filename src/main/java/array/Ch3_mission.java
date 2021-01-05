package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ch3_mission {
    /**
     문제, 3SUM
     숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 때 numbers 배열에 들어있는 수 세개를 더해서 target 숫자를 만들 수 있는 인덱스를 찾는 함수를 작성하라.
     예) numbers = [2, 3, 5, 7] target = 7, 7을 만들 수 있는 2, 3, 5의 인덱스인 0, 1, 2를 배열로 리턴해야 한다.
     **/

    public static void main(String[] args) {
        Ch3_mission threeSumSolutions = new Ch3_mission();

        System.out.println(Arrays.toString(threeSumSolutions.solution2(new int[]{2,3,5,7,1},6)));
    }


    /**
     * Time complexity : O(n^3)
     * space complexity : O(1)
     * @param numbers
     * @param target
     * @return
     */
    private int[] solution1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                int number1 = numbers[j];
                for (int k = j+1; k < numbers.length; k++) {
                    if((numbers[i] + numbers[j] + numbers[k]) == target){
                        return new int[]{i,j,k};
                    }

                }
            }
        }
        return null;
    }

    /**
     * Time complexity : O(n^2)
     * space complexity : O(n)
     * @param numbers
     * @param target
     * @return
     */
    private int[] solution2(int[] numbers, int target) {
        Map<Integer , Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersMap.put(numbers[i],i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int minusedNumber = target-numbers[i];
            for (int j = i +1 ; j < numbers.length; j++) {
                int findNumber = minusedNumber-numbers[j];
                if(numbersMap.containsKey(findNumber) && i != numbersMap.get(findNumber) && j != numbersMap.get(findNumber)){
                    return new int[]{i,j,numbersMap.get(findNumber)};
                }
            }
        }
        return null;
    }
}

package queue.ch2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


/**
 * 시간 복잡도 : O(n)
 * 공간 복잡도 : O(1)
 */
public class LRUcache {

    private int cacheSize = 3;
    private Deque<Integer> result= new LinkedList<>();

    public void query(int number){

        if(cacheSize == result.size()){
            if(result.contains(number)){
                result.remove(number);
            }else{
               result.removeLast();
            }
        }
        result.addFirst(number);
    }
    
    public void print(){
        if(result.isEmpty()){
            System.out.println("empty");
        }else{
            for (Integer integer : result) {
                System.out.println(integer);
            }
        }
    }


}

package queue.ch2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LRUcacheHashSet {

    private int cacheSize;

    private Set<Integer> cache;

    public LRUcacheHashSet(int cacheSize, Set<Integer> cache) {
        this.cacheSize = cacheSize;
        this.cache = new LinkedHashSet<>();
    }

    private void query(int number){

        if(!cache.contains(number)){
            if(cacheSize == cache.size()){
               int firstOne = cache.iterator().next();
               cache.remove(number);
            }

            cache.add(number);
        }else{
           cache.remove(number);
           cache.add(number);
        }

    }


    public void print(){
        System.out.println(cache);
    }
}

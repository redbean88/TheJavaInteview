package queue.ch2;

public class Ch2 {
    /**
     * LRU 캐시를 구현하라
     * 난이도 : 보통
     */
    public static void main(String[] args) {

        LRUcache solution = new LRUcache();
        solution.query(1);
        solution.query(2);
        solution.query(3);
        solution.query(1);
        solution.query(4);
        solution.query(2);
        solution.print();
    }

}

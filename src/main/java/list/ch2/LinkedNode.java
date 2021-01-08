package list.ch2;

public class LinkedNode {
    public int data;
    public LinkedNode next;


    public LinkedNode(int data) {
        this.data = data;
    }

    public void add(int data){
        LinkedNode end = new LinkedNode(data);

        LinkedNode pointer = this;
        while (pointer.next != null){
            pointer = this.next;
        }
        pointer.next = end;
    }


    public void print(){

     LinkedNode pointer = this;
     while (pointer.next != null){
         System.out.print(pointer.data+"=>");
     }
        System.out.println(pointer.data);
    }
}

package list.ch1;

public class LinkedList {
    Node head;

    static class Node{
        String data;
        Node next = null;
    }

    public LinkedList() {
        head = new Node();
    }

    public void append(String data){
        Node end = new Node();
        end.data = data;
        Node pointer = head;
        while (pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = end;
    }

    public void delete(String data){
        Node pointer = head;
        while(pointer.next != null){
            if(pointer.next.data.equals(data)){
                pointer.next = pointer.next.next;
            }else{
                pointer =pointer.next;
            }
        }
    }

    public void retrieve(){

        Node pointer = head.next;

        while(pointer.next != null){
            System.out.print(pointer.data+"->");
            pointer = pointer.next;
        }
        System.out.println(pointer.data);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append("일");
        ll.append("이");
        ll.append("삼");
        ll.append("사");
        ll.retrieve();
        ll.delete("일");
        ll.retrieve();
    }
    

}

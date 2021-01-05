package list.ch1;

public class Node {

    String data;
    Node next = null;

    public Node(String data) {
        this.data = data;
    }

    /**
     * key : 마지막 노드를 확인하여, 생성한 노드를 마지막 노드의 값음 값으로 설정한다
     * @param data
     */
    public void append(String data){
        Node end = new Node(data);

        Node pointer = this;
        while (pointer.next != null){
            pointer = pointer.next;
        }
        //반복문 종료시 현재 노드는 마지막 노드이다.
        pointer.next = end;
    }

    /**
     * key : 현재 노드의 다음 노드의 값을 확인하여, 일치시
     * 다음 노드의 next 값은 현재 노드의 next 값으로 변경 한다.
     * @param data
     */

    public void delete(String data){
        Node pointer = this;
        while(pointer.next != null){
            if(pointer.next.data.equals(data)){
                pointer.next = pointer.next.next;
            }else{
                pointer =pointer.next;
            }
        }
    }

    public void retrieve(){

        Node pointer = this;

        while(pointer.next != null){
            System.out.print(pointer.data+"->");
            pointer = pointer.next;
        }
        System.out.println(pointer.data);
    }
}

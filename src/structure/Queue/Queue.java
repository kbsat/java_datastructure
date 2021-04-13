package structure.Queue;

import structure.LikedList.LinkedList;
import structure.LikedList.ListNode;

public class Queue {

    private LinkedList list = new LinkedList();
    private ListNode head = null;
    private int count = -1;

    void enque(int data){
        count += 1;
        head = list.add(head,new ListNode(data),count);

    }

    int deque(){
        count -= 1;
        int data = list.getData(head,0);
        head = list.remove(head,0);

        return data;
    }

}

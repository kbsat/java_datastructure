package structure.Stack;

import structure.LikedList.LinkedList;
import structure.LikedList.ListNode;

public class Stack {

    private LinkedList list = new LinkedList();
    private ListNode head = null;
    private int top = -1;

    void push(int data){
        top += 1;
        head = list.add(head,new ListNode(data),top);
    }

    int pop(){
        if(top >= 0){
            int result = list.getData(head,top);
            head = list.remove(head,top--);
            return result;
        }
        else{
            System.out.println("값이 없습니다.");
            return -1;
        }
    }

}

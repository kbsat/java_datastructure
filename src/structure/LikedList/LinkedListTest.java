package structure.LikedList;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList list;
    private ListNode head;

    @BeforeEach
    void init(){
        list = new LinkedList();
        head = null;
    }

    @Test
    void add(){

        for (int i = 0; i < 10; i++) {
            head = list.add(head, new ListNode(i), i);
        }

        for (int i = 0;i<10;i++){
            Assertions.assertEquals(list.getData(head,i),i);
        }

    }

    @Test
    void remove(){
        int[] result = {0,2,3,5,6,8,9};

        for (int i = 0; i < 10; i++) {
            head = list.add(head, new ListNode(i), i);
        }
        list.print(head);
        list.remove(head,1);
        list.remove(head,3);
        list.remove(head,5);

        for(int i=0;i<7;i++){
            assertEquals(list.getData(head,i),result[i]);
        }
    }

    @Test
    void contains(){
        ListNode[] nodes = new ListNode[5];
        for (int i=0;i<5;i++){
            nodes[i] = new ListNode(i);
            head = list.add(head,nodes[i],i);
        }

        for(int i=0;i<5;i++){
            assertEquals(list.contains(head,i),true);
        }
        assertEquals(list.contains(head,100),false);
    }

}
package structure.LikedList;

public class LinkedList {

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){
        ListNode cur = head;

        if(cur == null){
            cur = nodeToAdd;
            return cur;
        }

        for(int i=0;i<position;i++){
            if(cur.getNext() == null){
                break;
            }
            else{
                cur = cur.getNext();
            }
        }
        cur.setNext(nodeToAdd);

        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove){
        ListNode cur = head;
        ListNode prev = null;

        for(int i=0;i<positionToRemove;i++){
            if(cur.getNext() == null){
                return null;
            }
            else{
                prev = cur;
                cur = cur.getNext();

            }
        }

        if(cur != null){
            prev.setNext(cur.getNext());
        }

        return head;

    }

    public boolean contains(ListNode head, ListNode nodeToCheck){
        ListNode cur = head;
        while(cur != null){
            if(cur == nodeToCheck){
                return true;
            }
            cur = cur.getNext();
        }

        return false;
    }

    public int getData(ListNode head, int positionToGetData){
        ListNode cur = head;
        for(int i=0;i<positionToGetData;i++){
            if(cur.getNext() == null){
                return -1;
            }
            else{
                cur = cur.getNext();
            }
        }

        return cur.getData();
    }
}

package structure.Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueuAndDeque(){
        int[] resultArr = {1,3,5,7,9};
        Queue q = new Queue();

        q.enque(1);
        q.enque(3);
        q.enque(5);
        q.enque(7);
        q.enque(9);

        for(int res : resultArr){
            int data = q.deque();
            assertEquals(data,res);
        }
    }
}
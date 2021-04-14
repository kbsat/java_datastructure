package structure.Heap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void insertAndDelete(){
        MinHeap heap = new MinHeap();
        int[] result = {1,2,3,4,6,8};
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);
        heap.insert(6);
        heap.insert(8);
        heap.insert(4);

        for (int res:result) {
            assertEquals(res,heap.delete());
        }



    }

}
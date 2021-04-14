package structure.Heap;

import java.util.ArrayList;

public class MinHeap implements Heap{

    private ArrayList<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
        heap.add(0);
    }

    @Override
    public void insert(int val) {
        heap.add(val);
        int idx = heap.size() - 1;

        while(idx > 1){
            if (val < heap.get(idx/2)){
                int temp = heap.get(idx/2);
                heap.set(idx/2,heap.get(idx));
                heap.set(idx,temp);

                idx = idx/2;
            }
            else{
                break;
            }
        }
    }

    @Override
    public int delete() {
        if (heap.size() - 1 < 1){
            return 0;
        }

        int delElem = heap.get(1);

        // root에 마지막 값 삽입
        heap.set(1,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int pos = 1;
        // 비교하면서 내려오기
        while((pos * 2) < heap.size()){
            int min = heap.get(pos * 2);
            int minPos = pos * 2;
            if((pos * 2 + 1) < heap.size() && min > heap.get(pos * 2 + 1) ){
                min = heap.get(pos * 2 + 1);
                minPos = minPos + 1;
            }

            if(heap.get(pos) < min){
                break;
            }

            int temp = heap.get(pos);
            heap.set(pos,min);
            heap.set(minPos,temp);
            pos = minPos;
        }

        return delElem;
    }
}

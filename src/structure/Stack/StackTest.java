package structure.Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    @DisplayName("스택 삽입과 출력")
    void pushAndPop(){
        int[] result = {5,4,3,2,1};
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for(int i = 0; i<5;i++){
            int data = stack.pop();
            System.out.println("data = "+ data+", result[i] = " + result[i]);
            assertEquals(data,result[i]);
        }
    }

}
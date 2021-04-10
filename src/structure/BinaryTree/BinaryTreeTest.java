package structure.BinaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BinaryTreeTest {

    private BinaryTree tree;
    private Node root;

    @BeforeEach
    void initTree(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node1.addLeft(node2);
        node1.addRight(node3);
        node2.addLeft(node4);
        node2.addRight(node8);
        node3.addLeft(node5);
        node3.addRight(node6);
        node5.addLeft(node7);

        tree = new BinaryTree(node1);
        root = tree.getRoot();
    }

    @Test
    void rootCheck(){
        Assertions.assertEquals(root.getValue(),1);
    }

    @Test
    void dfsCheck(){
        List<Integer> resultList = Arrays.asList(new Integer[]{1,2,4,8,3,5,7,6});
        List<Integer> dfsList= tree.dfs(root);

        Iterator<Integer> resultIt = resultList.iterator();
        Iterator<Integer> dfsIt = dfsList.iterator();
        while(resultIt.hasNext()){
            if(dfsIt.hasNext()){
                Assertions.assertEquals(dfsIt.next(),resultIt.next());
            }
            else{
                Assertions.fail();
            }
        }
    }

    @Test
    void bfsCheck(){
        List<Integer> resultList = Arrays.asList(new Integer[]{1,2,3,4,8,5,6,7});
        List<Integer> bfsList= tree.bfs(root);

        Iterator<Integer> resultIt = resultList.iterator();
        Iterator<Integer> bfsIt = bfsList.iterator();
        while(resultIt.hasNext()){
            if(bfsIt.hasNext()){
                Assertions.assertEquals(bfsIt.next(),resultIt.next());
            }
            else{
                Assertions.fail();
            }
        }

    }



}



package structure.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    private Node root;
    private List<Integer> result = new ArrayList<>();
    private Queue<Node> queue = new LinkedList<>();

    public BinaryTree(Node node){
        this.root = node;
    }

    public Node getRoot() {
        return root;
    }

    public List<Integer> dfs(Node cur){

        if(cur != null){
            result.add(cur.getValue());
            System.out.print(cur.getValue()+"->");
            dfs(cur.getLeft());
            dfs(cur.getRight());
        }

        return result;
    }

    public List<Integer> bfs(Node cur){

        if(cur == null){
            return result;
        }
        queue.add(cur);


        Node nowNode = queue.poll();
        while(nowNode != null){
            result.add(nowNode.getValue());
            System.out.print(nowNode.getValue()+"->");

            Node leftNode = nowNode.getLeft();
            Node rightNode = nowNode.getRight();

            if (leftNode != null){
                queue.add(leftNode);
            }

            if (rightNode != null){
                queue.add(rightNode);
            }

            nowNode = queue.poll();
        }

        return result;
    }
}

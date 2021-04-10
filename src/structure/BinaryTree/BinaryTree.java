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

    public void clearList(){
        result.clear();
        queue.clear();
    }

    public List<Integer> getList() {
        return result;
    }

        public List<Integer> dfsLogic(Node cur){
        if(cur != null){
            result.add(cur.getValue());
            System.out.print(cur.getValue()+"->");
            dfsLogic(cur.getLeft());
            dfsLogic(cur.getRight());
        }

        return result;
    }

    public List<Integer> bfsLogic(Node cur){
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

    public List<Integer> dfs(Node cur){
        clearList();
        return dfsLogic(cur);
    }

    public List<Integer> bfs(Node cur){
        clearList();
        return bfsLogic(cur);
    }

}

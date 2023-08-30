public class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    BinaryTree(int val) {
        root = new Node(val);
    }

    public void insertLeft(Node r, int val) {
        Node newNode = new Node(val);
        r.left = newNode;
    }

    public void insertRight(Node r, int val) {
        Node newNode = new Node(val);
        r.right = newNode;
    }

    public void preOrder(Node rt) {
        if (rt != null) {
            System.out.print(rt.data + " ");
            preOrder(rt.left);
            preOrder(rt.right);
        }
    }

    public void inOrder(Node rt){
        if(rt != null){
            inOrder(rt.left);
            System.out.print(rt.data + " ");
            inOrder(rt.right);
        }
    }

    public void postOrder(Node rt){
        if(rt != null){
            postOrder(rt.left);
            postOrder(rt.right);
            System.out.print(rt.data + " ");   
        }
    }

}

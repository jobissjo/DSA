public class AVLTree {
    Node root;

    class Node {
        int key;
        Node left, right;

        Node(int val) {
            key = val;
            left = right = null;
        }
    }

    AVLTree(int val) {
        root = new Node(val);
    }

    AVLTree() {
        root = null;
    }

    public Node insert(Node node, int val) {
        if (node == null)
            return new Node(val);
        if (node.key > val)
            node.left = insert(node.left, val);
        else
            node.right = insert(node.right, val);
        return node;
    }

    public void inOrder(Node rt) {
        if (rt != null) {
            inOrder(rt.left);
            System.out.print(rt.key + " ");
            inOrder(rt.right);
        }
    }
}

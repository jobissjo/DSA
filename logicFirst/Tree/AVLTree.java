public class AVLTree {
    Node root;

    class Node {
        int key;
        Node left, right;
        int height;

        Node(int val) {
            key = val;
            left = right = null;
            int height = 0;
        }
    }

    AVLTree(int val) {
        root = new Node(val);
    }

    AVLTree() {
        root = null;
    }
    public void insert(int val){
        root = insert(root, val);
    }

    public Node insert(Node node, int val) {
        if (node == null)
            return new Node(val);
        if (node.key > val)
            node.left = insert(node.left, val);
        else if (node.key < val)
            node.right = insert(node.right, val);
        else 
            return node;
        
        node.height = 1 + max(getHeight(node.left),getHeight(node.right));
        int balanceFactor = getBalanceFactor(node);

        if (balanceFactor > 1 && val < node.left.key){
            return rightRotate(node);
        }
        if (balanceFactor > 1 && val > node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balanceFactor < -1  && val > node.right.key){
            return leftRotate(node);
        }
        if (balanceFactor < -1 && val < node.right.key){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    private Node rightRotate(Node z){
        Node y = z.left;
        Node t1 = y.right;

        y.right = z;
        z.left = t1;

        y.height = 1 + max(getHeight(y.left), getHeight(y.right));
        z.height = 1 + max(getHeight(z.left), getHeight(z.right));

        return y;
    }

    private Node leftRotate(Node z){
        Node y = z.right;
        Node t1 = y.left;

        y.left = z;
        z.right = t1;

        y.height = 1 + max(getHeight(y.left), getHeight(y.right));
        z.height = 1 + max(getHeight(z.left), getHeight(z.right));

        return y;
    }
    private int getHeight(Node node){
        if (node == null)
            return -1;
        return node.height;
    }

    private int getBalanceFactor(Node node){
        if (node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }
    private int max(int a, int b){
        return a>b? a:b;
    }

    public void inOrder(Node rt) {
        if (rt != null) {
            inOrder(rt.left);
            System.out.print(rt.key + " ");
            inOrder(rt.right);
        }
    }
}

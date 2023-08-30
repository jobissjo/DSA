public class BinarySearchTree {
    Node root;
    class Node{
        int key;
        Node left, right;
        Node(int val){
            key = val;
            left = right = null;
        }
    }
    BinarySearchTree(int val){
        root = new Node(val);
    }
    BinarySearchTree(){
        root = null;
    }

    public Node insert(Node root,int val){
        if(root == null)
            return new Node(val);
        if(root.key > val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    public Node search(Node root,int val){
        if(root == null || root.key == val)
            return root;
        if(root.key > val)
            return search(root.left, val);
        return search(root.right, val);
        
    }

    public void inOrder(Node rt){
        if(rt != null){
            inOrder(rt.left);
            System.out.print(rt.key + " ");
            inOrder(rt.right);
        }
    }

}

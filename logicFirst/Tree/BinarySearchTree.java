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

    public Node delete(Node root, int val){
        if (root == null)
            return root;
        if(root.key > val)
            root.left = delete(root.left, val);
        else if(root.key < val)
            root.right = delete(root.right, val);
        else{
            if(root.left == null && root.right == null)
                return root.left;
            else if(root.left == null)
                return root.left;
            else if(root.right == null)
                return root.right;
            root.key = min(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    public int min(Node root){
        int minVal = root.key;
        while(root.left != null){
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;

    }

}

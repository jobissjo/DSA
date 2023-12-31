public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(6);
        tree.insertLeft(tree.root, 5);
        tree.insertRight(tree.root, 7);
        tree.insertLeft(tree.root.left, 2);
        tree.insertRight(tree.root.left, 3);
        System.out.println("Preorder Travesal");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("Inorder Travesal");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Postorder Traversal");
        tree.postOrder(tree.root);
        System.out.println();

        // Binary Search Tree
        System.out.println("Binary Search Tree");
        BinarySearchTree bTree = new BinarySearchTree(50);
        bTree.insert(bTree.root, 20);
        bTree.insert(bTree.root, 10);
        bTree.insert(bTree.root, 30);
        bTree.insert(bTree.root, 70);
        bTree.insert(bTree.root, 60);
        bTree.insert(bTree.root, 90);  

        bTree.inOrder(bTree.root);

        if(bTree.search(bTree.root, 10) == null)
            System.out.println("Value Not found");
        else
            System.out.println("Value Found");
        
        bTree.delete(bTree.root, 50);
        bTree.inOrder(bTree.root);

        System.out.println();
        AVLTree tree2 = new AVLTree(5);
        tree2.insert(10);
        tree2.insert(4);
        tree2.insert(11);
        tree2.insert(12);
        tree2.insert(15);
        tree2.insert(3);

        tree2.inOrder(tree2.root);
    }

    
}

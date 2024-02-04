//Subject 1.1
class Node {
    int value;
    Node left, right;
    public Node(int item) {
        value = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);

        return root;
    } //END of subject 1.1
     //Subject 1.2

    void printPreorder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }

    void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.value + " ");
            printInorder(node.right);
        }
    }

    void printPostorder(Node node) {
        if (node != null) {
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] values = {6, 4, 3, 5, 8, 7, 9};

        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("Preorder traversal:");
        tree.printPreorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.printInorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.printPostorder(tree.root);
    }
}
//End of subject 1.2

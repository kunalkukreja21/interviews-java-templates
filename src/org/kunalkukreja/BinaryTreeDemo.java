package org.kunalkukreja;

public class BinaryTreeDemo {
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));

        // Find depth of tree.
        System.out.println("Depth of tree: " + findDepth(root));
    }

    private static Integer findDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int ans = 1;
        if (root.getLeft() != null) {
            ans = Math.max(ans, findDepth(root.getLeft()) + 1);
        }
        if (root.getRight() != null) {
            ans = Math.max(ans, findDepth(root.getRight()) + 1);
        }
        return ans;
    }
}

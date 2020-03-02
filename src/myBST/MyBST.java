package myBST;

import node.Node;

public class MyBST {
    Node root;

    public MyBST() {
        root = null;
    }

    public void insert(int val) {
        Node newnode = new Node();
        newnode.data = val;
        if (root == null) {
            root = newnode;
        } else {
            Node current = root;
            Node present = null;
            while (true) {
                present = current;
                if (val < current.data) {
                    current = current.Left;
                    if (current == null) {
                        present.Left = newnode;
                        return;
                    }
                } else {
                    current = current.Right;
                    if (current == null) {
                        present.Right = newnode;
                        return;
                    }
                }
            }
        }


    }

    public void Inorder(Node root) {
        Inorder(root.Left);
        System.out.println(root.data);
        Inorder(root.Right);

    }

}

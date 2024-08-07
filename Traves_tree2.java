class Node{
    int data;
    Node left , right;

    public  Node(int item){
        data = item;
        left = right = null;
    }
}

public class Traves_tree2{
    Node root;
    public static void main(String arg[]){
        Traves_tree2 tree = new Traves_tree2();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(9);
        tree.root.left.left.right = new Node(1);
        tree.root.right = new Node(5);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(8);
        System.out.println("Pre-order");
        tree.Preorder(tree.root);
        System.out.println();
        System.out.println("In-order");
        tree.Inorder(tree.root);
        System.out.println();
        System.out.println("post-order");
        tree.Postorder(tree.root);
    }
    void Preorder(Node nod){
        if(nod==null)return;
        System.out.print(nod.data+" ");
        Preorder(nod.left);
        Preorder(nod.right);
    }
    void Inorder(Node nod){
        if(nod==null)return;
        Inorder(nod.left);
        System.out.print(nod.data+" ");
        Inorder(nod.right);
    }
    void Postorder(Node nod){
        if(nod==null)return;
        Postorder(nod.left);
        Postorder(nod.right);
        System.out.print(nod.data+" ");
    }

}
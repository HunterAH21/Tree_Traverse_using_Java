class Index{
    int data;
    Index left,right;

    public Index(int item){
        data = item;
        left = right = null;
    }
}

 public class Traves_tree1{
        Index root;
       public static void main(String[] args){
            Traves_tree1 tree = new Traves_tree1();
            tree.root = new Index(1);
            tree.root.left = new Index(2);
            tree.root.right = new Index(3);
            tree.root.left.left = new Index(4);
            tree.root.left.right = new Index(5);
            tree.root.left.right.left = new Index(8);
            tree.root.right.left = new Index(6);
            tree.root.right.right = new Index(7);
            tree.root.right.right.left = new Index(9);
            tree.root.right.right.right = new Index(10);

            System.out.println("Pre-order");
            tree.Preorder(tree.root);
            System.out.println();
            System.out.println("In-order");
            tree.Inorder(tree.root);
            System.out.println();
            System.out.println("Post-order");
            tree.Postorder(tree.root);
        }
        void Preorder(Index Index){
            if(Index == null) return;
            System.out.print(Index.data + " ");
            Preorder(Index.left);
            Preorder(Index.right);
        }
        void Inorder(Index Index){
            if(Index == null) return;
            Preorder(Index.left);
            System.out.print(Index.data + " ");
            Preorder(Index.right);
        }
        void Postorder(Index Index){
            if(Index == null) return;
            Preorder(Index.left);
            Preorder(Index.right);
            System.out.print(Index.data + " ");
        }
    }
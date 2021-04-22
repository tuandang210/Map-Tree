package Optional;
public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println();
        System.out.print("Postorder: ");
        System.out.println();
        tree.postOrder();
        System.out.println();

        System.out.print("Preorder: ");
        System.out.println();
        tree.preOrder();
    }
}

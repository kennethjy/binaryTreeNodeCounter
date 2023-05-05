public class BinaryTreeNodes {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        System.out.println(countElements(root));
    }

    public static int countElements(Node root){
        int num = 1;
        if (root.left != null){
            num += countElements(root.left);
        }
        if (root.right != null){
            num += countElements(root.right);
        }
        return num;
    }

}
class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
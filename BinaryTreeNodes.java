public class BinaryTreeNodes {
    public static void main(String[] args) {
        Node root = createTree(new int[]{4, 3, 5, 7, 6});
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

    public static Node createTree(int[] data){
        Node root = new Node(data[0]);
        for(int i = 1 ; i < data.length; i++){
            root.insertNode(data[i]);
        }
        return root;
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

    public void insertNode(int data){
        if (data < this.data){
            if (this.left == null){
                this.left = new Node(data);
            } else {
                this.left.insertNode(data);
            }
        }
        else if (data > this.data){
            if (this.right == null){
                this.right = new Node(data);
            } else {
                this.right.insertNode(data);
            }
        }
    }
}
package treeAlgorithms;

public class Searcher {

    public static int findSizeOfTree(Node root){
        return findSizeOfTree(root, 0);
    }


    private static int findSizeOfTree(Node root, int sizeSoFar){
        if (root == null) return sizeSoFar;
        int leftSize = findSizeOfTree(root.getLeftChild());
        int rightSize = findSizeOfTree(root.getRightChild());
        return sizeSoFar + leftSize + rightSize + 1;
    }

    public static Node findkthLowestNode(Node root, int k){
        if (root == null) return null;

        int leftSize = findSizeOfTree(root.getLeftChild());
        if (leftSize == k)
            return root;
        else
            if (leftSize > k)
                return findkthLowestNode(root.getLeftChild(), k);
            else
                return findkthLowestNode(root.getRightChild(), k - leftSize -1);
    }
}

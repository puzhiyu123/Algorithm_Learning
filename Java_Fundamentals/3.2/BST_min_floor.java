// an example of BST's min/max and floor function
class BST_Min_Floor {
    // Continue with Min, max, floor and ceiling

    private Node root; // root of BST

    private class Node {
        private Key key; // key
        private Value val; // associated value
        private Node left, right; // links to subtrees
        private int n; // # nodes in subtree rooted here

        public Node(Key key, Value val, int n) {
            this.key = key;
            this.val = val;
            this.n = n;
        }

        private int size() {
            return size(root);
        }

        private int size(Node x) {
            if (x == null) // if the node is empty, there's no size
                return 0;
            else
                return x.n; // if there are nodes, return the number of its subtree
        }

    public Key min() {
        if (isEmpty())
            throw new NoSuchElementException();
        Node x = min(root);
        return x.key;
    }

    public Node min(Node x) {
        if (x.left == null)
            return x;
        return min(x.left);
    }

    public Key floor(Key key) {
        // a floor is the largest key in the BST less than or equal to key
        Node x == floor(root, key);
        if (x == null)
            throw new NoSuchElementException();
        return x.key;
    }

    private Node floor(Node x, Key key) {
        // a floor is the largest key in the BST less than or equal to key
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);

        if (cmp == 0)
            return x;
        if (cmp < 0)
            return floor(x.left, key);

        Node t = floor(x.right key);

        if (t != null)
            return t;
        else
            return x;
    }
}
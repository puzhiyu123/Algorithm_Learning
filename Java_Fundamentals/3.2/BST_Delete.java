class BST_Delete {
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

        public void deleteMin() {
            if (isEmpty())
                throw new NoSuchElementException();
            root = deleteMin(root);
        }

        private Node deleteMin(Node x) {
            if (x.left == null)
                return x.right;
            x.left = deleteMin(x.left);
            x.n = size(x.left) + size(x.right) + 1;
            return x;
        }

        private Node delete(Node x, Key key) {
            if (x == null)
                return null;

            int cmp = key.compareTo(x.key);

            if (cmp < 0)
                x.left = delete(x.left, key);
            if (cmp > 0)
                x.right = delete(x.right, key);
            else {
                if (x.right == null)
                    return x.left;
                if (x.left == null)
                    return x.right;
                Node t = x;

                x = min(t.right);
                x.right = deleteMin(t.right);
                x.left = t.left;
            }

            x.n = size(x.left) + size(x.right) + 1;
            return x;
        }
    }
}
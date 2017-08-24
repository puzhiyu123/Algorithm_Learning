// a binary search tree example
public class BST<Key extends Comparable<Key>, Value>
{
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

        public Value get(Key key) { // get is a search function
            return get(root, key);
        }

        private Value get(Node x, Key key) {
            // Return value associated with key in the subtree rooted at x;
            // return null if key is not present in subtree rooted at x.
            if (x == null)
                return null;

            int cmp = key.compareTo(x.key);

            if (cmp < 0)
                return get(x.left, key);
            else if (cmp > 0)
                return get(x.right, key);
            else
                return x.val;
        }

        public void put(Key key, Value val) {
            // search for a key. Update value if found; grow table if new
            root = put(root, key, val);
        }

        private Node put(Node x, Key key, Value val) {
            // change key's value to val if key in subtree is rooted at x
            // otherwise, add new node to subtree associating key with val
            if (x == null)
                return new Node(key, val, 1);
            int cmp = key.compareTo(x.key);

            if (cmp < 0)
                x.left = put(x.left, key, val);
            if (cmp > 0)
                x.fight = put(x.right, key, val);
            else
                x.val = val; // update the value if found

            x.n = size(x.left) + size(x.right) + 1;

            return x;
        }
    }
}
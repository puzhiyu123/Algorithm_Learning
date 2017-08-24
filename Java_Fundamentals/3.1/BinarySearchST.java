class BinarySearchST<Key extends Comparable<Key>, Value> {
    private Key[] keys;
    private Value[] values;
    private int n;

    public BinarySearchST(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }

    public int size() {
        return n;
    }

    // get an element (search)
    public Value get(Key key) {
        if(isEmpty())
            return null;
        int i = rank(key);
        if(i < n && keys[i].compareTo(key) == 0)
            return vals[i];
        else
            return null;
    }

    // put an element (insert)
    public void put (Key key, Value val) {
        int i = rank(key);
        if(i < n && keys[i].compareTo(key) == 0) {
            vals[i] = val;
            return;
        } for(int j = n; j > i; j--) {
            keys[j] = keys[j - 1];
            vals[j] = vals[j - 1];
        }

        keys[i] = key;
        vals[i] = val;
        n++;
    }

    // rank is the number of keys less than key
    public int rank(Key key) {
        int lo = 0;
        int hi = n-1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp > 0)
                hi = mid - 1;
            if (cmp < 0)
                lo = mid + 1;
            else return mid;
        }
        return lo;
    }

    public Key min() {
        return keys[0];
    }

    public Key max() {
        return keys[n-1];
    }

    // select one key from the tree
    public Key select(int k) {
        return keys[k];
    }

    public Key ceiling(Key key) {
        int i = rank(key);
        return Keys[i];
    }

}
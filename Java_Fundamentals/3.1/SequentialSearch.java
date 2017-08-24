// algorithm example:
// Sequential search in Binary Tree:
public class SqeuentialSearch<Key, Value> {
    private Node first; // first node in the linked list

    // linked list in private
    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    // get method
    public Value get(Key key) {
        for(Node x = first; x != null; x = x.next) {
            if(key.equals(x.key))
                return x.val; // search hit
            else
                return null;
        }
    }

    // put method
    public void put(Key key, Value val) {
        // search for key, update value if found, grow table if new
        for (Node x = first; x != null; x = x.next) {
            if(key.equals(x.key)){
                x.val = val;
                return;
            } // search hit, update val
            else {
                first = new Node(key, val, first);
            }
        }
    }

    // delete method
    public void delete(Key key){
        if(isEmpty())
            throw new NoSuchElementException();
        else {
            put(key, null);
            return;
        }
    }
}
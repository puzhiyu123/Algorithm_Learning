
// question:

// how to determine if a singly linked list has a circle

class detectCircle {
    public static boolean containsCycle(LinkedListNode firstNode) {
        LinkedListNode slowRunner = firstNode;
        LinkedListNode fastRunner = firstNode;

        while(fastRunner != null && slowRunner.next != null)
        {
            slowRunner = slowRunner.next; // the slow runner would run slower
            fastRunner = fastRunner.next; // the fast runner run quicker

            // if they ever intersect, meaning this list is in a cycle
            if (slowRunner == fastRunner)
            {
                return true;
            }
        } else { // if the fastRunner meet the end of the list
            return false;
        }
    }
}
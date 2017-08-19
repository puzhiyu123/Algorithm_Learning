// a sample Queue program

// note that for Queue, the sequence is 'first in first out' (FIFO),
// which resemble the bank line, where the first customer is served first

class Queue {
    // private method to prevent outside access
    private char q[];
    private putloc,getloc;

    queue(int size) {
        q = new char[size];
        putloc = getloc = 0;

    void put(char ch) { // put an element inside a Queue
        if (putloc = q.length) {
            // if the position where we want to put the queue in is the same length as the array, it is full
            system.out.println(" The Queue is full");
            return
        }

        q[putloc++] = ch;
    }

    void get(char ch) {// get an element inside a Queue
        if (getloc = putloc){
            // if the position where we want to get the element is the same as the position we want to put
            // the element, remember Queue is FIFO, therefore the Queue is empty
            system.out.println(" The Queue is empty");
            return (char) 0;
        }

        return q[getloc++];

    }
}
}
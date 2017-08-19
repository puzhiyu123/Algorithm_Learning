// enhanced Queue version using Object as parameters

// refer Queue.java as another version without using objects as parameters

class Queue2 {
    private char q[];
    private int putloc, getloc;

    // Construct an empty Queue given its size
    Queue (int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Construct a Queue from a Queue
    Queue (Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copy elements
        for(int i=getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Construct a Queue with initial values
    Queue (char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i=0; i < a.length; i++)
            put(a[i]);
    }

    // put a character into the queue (first in)
    void put(char ch){
        if(putloc == q.length) {
            System.out.println("The queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // get a character from the queue (first out)
    char get() {
        if(getloc = putloc) {
            System.out.println("The queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }


    // the demostration is omitted for simplicity
}
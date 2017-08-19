// an example illustrating the Stack mathod
class Stack {
    private char stck[]; // this array holds the stack
    private int tos; // the top of the stack

    // construct an empty stack given its size
    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    // construct a Stack from Stack
    Stack(stack ob) {// paramater as an object
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // copy elements
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // construct a stack with initial values
    Stack(char a[]) {
        stck = new char[a.length];

        for(int i=0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // push a character onto the Stack
    void push(char ch) {
        if(tos==stck.length) {
            System.out.println(" The Stack is full");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    // pop a character from the stack
    char pop() {
        if(tos==0) {
            System.out.println(" The Stack is empty");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }

    // the demonstration process is omitted for simplicity
}
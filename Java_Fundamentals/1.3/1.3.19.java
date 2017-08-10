// code segment provided

class removeLastNode {
    public static void main(String args[])
    {
        ... // omitted front part

        current = head;

        while(current.next.next != null)
        {
            current = current.next; // delete the last node
        }

        current.next = null;

        ... // omitted last part
    }
}
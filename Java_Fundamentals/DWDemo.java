/*
    Simple Java Do...While Application
 */

/*

Compile Example:

I am thinking of a letter between A and Z.
Can you guess it?
Z
... Sorry, you are Too high
I am thinking of a letter between A and Z.
Can you guess it?
U
... Sorry, you are Too high
I am thinking of a letter between A and Z.
Can you guess it?
I
... Sorry, you are Too low
I am thinking of a letter between A and Z.
Can you guess it?
P
... Sorry, you are Too high
I am thinking of a letter between A and Z.
Can you guess it?
O
... Sorry, you are Too high
I am thinking of a letter between A and Z.
Can you guess it?
L
... Sorry, you are Too high
I am thinking of a letter between A and Z.
Can you guess it?
J
... Sorry, you are Too low
I am thinking of a letter between A and Z.
Can you guess it?
K
** Right **



 */


class DWDemo {
    public static void main(String args[])
        throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("I am thinking of a letter between A and Z.");
            System.out.println("Can you guess it?");

            // read the character
            ch = (char) System.in.read();

            // discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            if(ch == answer) {
                System.out.println("** Right **");
            } else {
                System.out.print("... Sorry, you are ");
                if(ch < answer) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            }
        } while(answer != ch);
    }
}


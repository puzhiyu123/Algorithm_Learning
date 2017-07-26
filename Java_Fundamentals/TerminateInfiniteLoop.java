/*
   Sometimes we will encouter infinite loops, here is
     an example of exiting infinite loops.
 */

class TerminateInfiniteLoop {
    public static void main(String args[]) {
        throws java.io.IOException {

            char ch;

            for( ; ;) {// the infinite loop is terminated by the break
                // read the user input
                ch = (char) System.in.read();
                // breaks an infinite loop if meet conditions
                if (ch == 'q') break;
            }
            System.out.println("You passed q! :)");
        }
    }
}
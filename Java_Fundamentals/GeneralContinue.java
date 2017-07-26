/*

In Java many times we have to use the continue statement.

Here is an example of printing only the even numbers between
  0 and 100 using the continue statement.

 */

class GeneralContinue {
    public static void main(String args[]) {
        int i;

        // print the even numbers between 0 and 100
        for(i = 0; i <= 100; i++) {
            if((i%2) != 0) continue; // iterate
            System.out.println(i);
        }
    }
}
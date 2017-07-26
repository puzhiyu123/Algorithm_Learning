/*
   In Java, loops can be terminated by a break statement,
      here is an example
 */

/*
   The program will produce the following output:
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9 Loop Complete
 */

class TerminateLoop {
    public static void main(String args[]) {
        int num;

        num = 100;

        // loop while i-squared is less than num
        for(int i = 0; i < num; i++) {
            if(i*i >= num) break; // terminate loop if i*i >= 100
            System.out.print(i + ", ");
        }
        System.out.println("Looping is complete.");
    }
}
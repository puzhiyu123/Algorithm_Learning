/*
   Demontrate a block of code function in Java
 */

 class BlockDemo {
     public static void main(String args[]) {
         double i, j, d;

         i = 5;
         j = 10;

         // the target of this if this is a block
         if(i != 0) {
             System.out.println("i does not equal zero");
             d = j / i;
             System.out.println("j / i is " + d);
         }
     }
 }
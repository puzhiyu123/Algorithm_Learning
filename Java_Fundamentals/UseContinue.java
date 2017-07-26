/*

   Good use of continue is rare, here is an example
     for while loop and for loop conditions

 */


class UseContinue {
    public static void main(String args[]) {

        outerloop:
        for(int i=1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i
            + ", inner loop: ");

            for(int j=1; j < 10; j++) {
                if(j == 5) continue outerloop; // continue the outerloop
                System.out.print(j);
            }
        }
    }
}
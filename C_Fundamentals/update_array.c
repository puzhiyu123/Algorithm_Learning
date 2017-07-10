/*

  Consider LA is a linear array with N elements and K is a positive integer such that K<=N.
  Following is the algorithm to update an element available at the Kth position of LA.

  1. Start
  2. Set LA[K-1] = ITEM
  3. Stop

*/

#include <stdio.h>

main() {
   int LA[] = {1,3,5,7,8};
   // update element at the Kth position
   int k = 3, n = 5, item = 10;
   int i, j;

   printf("The original array elements are :\n");

   for(i = 0; i<n; i++) {
      printf("LA[%d] = %d \n", i, LA[i]);
   }

   LA[k-1] = item;

   printf("The array elements after updation :\n");

   for(i = 0; i<n; i++) {
      printf("LA[%d] = %d \n", i, LA[i]);
   }
}

/*

  the output of this update program is as follows:

  The original array elements are :

  LA[0] = 1
  LA[1] = 3
  LA[2] = 5
  LA[3] = 7
  LA[4] = 8

  The array elements after update :

  LA[0] = 1
  LA[1] = 3
  LA[2] = 10
  LA[3] = 7
  LA[4] = 8

*/

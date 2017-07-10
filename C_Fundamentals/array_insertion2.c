/*

Let LA be a Linear Array (unordered) with N elements and K is a positive integer such that K<=N.
Following is the algorithm where ITEM is inserted into the Kth position of LA.

1. Start
2. Set J = N
3. Set N = N+1
4. Repeat steps 5 and 6 while J >= K
5. Set LA[J+1] = LA[J]
6. Set J = J-1
7. Set LA[K] = ITEM
8. Stop

*/


#include <stdio.h>

main() {
   int LA[] = {1,3,5,7,8};
   int item = 10, k = 3, n = 5;
   int i = 0, j = n;

   printf("The original array elements are :\n");

   for(i = 0; i<n; i++) {
      printf("LA[%d] = %d \n", i, LA[i]);
   }

   n = n + 1;

   // making spaces for the new item by moving every item after k forward
   while( j >= k) {
      LA[j+1] = LA[j];
      j = j - 1;
   }

   // add the item
   LA[k] = item;

   printf("The array elements after insertion :\n");

   for(i = 0; i<n; i++) {
      printf("LA[%d] = %d \n", i, LA[i]);
   }
}

/*

 the program's output is as follows:

 The original array elements are :
 LA[0] = 1
 LA[1] = 3
 LA[2] = 5
 LA[3] = 7
 LA[4] = 8
 The array elements after insertion :
 LA[0] = 1
 LA[1] = 3
 LA[2] = 5
 LA[3] = 10
 LA[4] = 7
 LA[5] = 8

*/
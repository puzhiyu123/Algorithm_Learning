/*
 * Let's create a simply binary search function in C
 */


/*
 *

   Procedure binary_search
   A ← sorted array
   n ← size of array
   x ← value to be searched

   Set lowerBound = 1
   Set upperBound = n

   while x not found
      if upperBound < lowerBound
         EXIT: x does not exists.

      set midPoint = lowerBound + ( upperBound - lowerBound ) / 2

      if A[midPoint] < x
         set lowerBound = midPoint + 1

      if A[midPoint] > x
         set upperBound = midPoint - 1

      if A[midPoint] = x
         EXIT: x found at location midPoint

   end while

end procedure


 */

#include <stdio.h>

#define MAX 10

// example array
int intArray[MAX] = {1, 2, 3, 4, 6, 7, 9, 11, 12, 14, 15, 16, 17, 19, 33, 34, 43, 45, 55, 66};

int main(int data) {
    int lowerBound = 0;
    int upperBound = MAX - 1;
    int midPoint = -1;
    int comparisons = 0;
    int index = -1;


    // binary search tree is not working here, check on the latest book for simplification!!!!!

    while (lowerBound < upperBound) {

        midPoint = lowerBound + (upperBound - lowerBound) / 2;

        if (intArray[midPoint] == data) {
            index = midPoint;
            printf("The search is complete! The result is: %d\n", midPoint);
        } else if (intArray[midPoint] < data) {
            lowerBound = midPoint + 1;
        } else {
            upperBound = midPoint - 1;
        }
    }
}
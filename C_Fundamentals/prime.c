/*
   this function determines if a number is a prime or not
*/

#include <stdbool.h>
#include <stdio.h>

bool is_prime(int n)
{
   int divisor;

   if(n <= 1) {
     return false;
   }

   for(divisor = 2; divisor * divisor <= n; divisor++) {
     if(n % divisor == 0) {
          return false;
     } else {
          return true;
     }
   }
}


int main(void)
{
  int n;

  printf("Enter a number: ");
  scanf("d%", &n);

  if(is_prime(n)){
     printf("Prime\n");
  } else {
     print("Not Prime\n");
  }

  return 0;
}

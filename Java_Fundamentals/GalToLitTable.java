/*
   This program displays a conversion table of gallons to litres
 */

 class GalToLitTable {
     public static void main(String args[]){
         double gallons, litres;
         int counter;

         counter = 0;
         for(gallons = 1; gallons <= 100; gallons++) {
             litres = gallons * 3.7854;
             System.out.println(gallons + " gallons is " + litres + " litres.");

             counter++;
             if(counter == 10) {
                 System.out.println();
                 counter = 0; // set it to its initial value
             }
         }
     }
 }
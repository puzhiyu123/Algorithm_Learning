/*
   This simple program converts gallons to litres.
 */

 class GaltoLit {
     public static void main(String args[]) {
         double gallons;
         double litres;

         gallons = 10;

         litres = gallons * 3.7854;

         System.out.println(gallons + " gallons is " + litres + " litres.");
     }
 }
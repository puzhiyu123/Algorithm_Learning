/*
   This is a sample Bag API in Java
 */

// useful Bag APIs for reference:

public class Bag<item> // implements Iterable <Item>

Bag() // create an empty bag

void add(Item item) // add an item

boolean isEmpty() // is the bag empty?

int size() // number of items in the bag


// below is a typical bag client

public class StatBag {
    public static void main(String[] args)
    {
        Bag<Double> numbers = new Bag<Double>();

        while (!StdIn.isEmpty())
            numbers.add(StdIn.readDouble());
        int n = number.size();

        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum/n;

        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean) * (x - mean);
        double stddev = Math.sqrt(sum/(n-1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Stddev: %.2f\n", stddev);

    }
}
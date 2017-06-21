import java.util.Arrays;

/*
   this program takes the name of a whitelist file, aka,
   a sequence of integers as argument and filters
   any entry that is on the whitelist from
   the standard input
 */

public class Search
{
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi) {
            // the key is in a [lo..hi] array, or it is empty
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                hi = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[], args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty())
        {
            // read the key, and it would print it if
            // it is not in the whitelist
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}
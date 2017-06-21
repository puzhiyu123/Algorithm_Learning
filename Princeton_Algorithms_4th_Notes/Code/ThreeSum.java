/*
    textbook section 1.4 example 1
 */

public class ThreeSum
{
    public static int count(int[] a)
    {
        // Count triples that sum to zero
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N, i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    // clearly, when these three numbers' sum is 0
                    if (a[i] + a[j] + a[k] == 0)
                        // it returns the integer
                        cnt++;
        return cnt;
    }

    public static void main(String args[])
    {
        int[] a = In.readInts(args[0]);
        Std.Out.println(count(a));
    }
}
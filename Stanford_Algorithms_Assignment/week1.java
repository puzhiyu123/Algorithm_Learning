using System;
        using System.Numerics;
        namespace Algorithams
        {
class week1
{
    //You have to reference System.Numerics
    static void Main()
    {
        BigInteger fNumber = BigInteger.Parse("3141592653589793238462643383279502884197169399375105820974944592");
        BigInteger sNumber = BigInteger.Parse("2718281828459045235360287471352662497757247093699959574966967627");

        BigInteger result = Karatsuba(fNumber, sNumber);

        BigInteger expectingResult = fNumber * sNumber;

        if (expectingResult == result)
        {
            Console.WriteLine(true);
        }
    }


    public static BigInteger Karatsuba(BigInteger x, BigInteger y)
    {
        int xLength = TakeLength(x);
        int yLength = TakeLength(y);

        int biggestNumber = Math.Max(xLength, yLength);

        if (x <= int.MaxValue || y <= int.MaxValue)
        {
            return x * y;
        }

        biggestNumber = (biggestNumber / 2);

        var divison = CalculatePow(biggestNumber);

        BigInteger a = x / divison;
        BigInteger b = x % divison;
        BigInteger c = y / divison;
        BigInteger d = y % divison;

        BigInteger ac = Karatsuba(a, c);
        BigInteger bd = Karatsuba(b, d);
        BigInteger ad_plus_bc = Karatsuba(a + b, c + d) - ac - bd;

        var acPow = CalculatePow((biggestNumber * 2));
        var ad_plus_bcPow = CalculatePow(biggestNumber);

        var result = (ac * acPow) + ((ad_plus_bc * ad_plus_bcPow)) + (bd);

        return result;
    }

    private static int TakeLength(BigInteger x)
    {
        int counter = 0;

        while (x >= 1)
        {
            x /= 10;
            counter++;
        }

        return counter;
    }

    private static BigInteger CalculatePow(int n)
    {
        BigInteger num = 1;

        for (int i = 0; i < n; i++)
        {
            num *= 10;
        }

        return num;
    }

}
}
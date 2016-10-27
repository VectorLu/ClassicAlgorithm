import edu.princeton.cs.algs4.*;

public class ThreeSum
{
    public static int count(int[] a)
    {   //Count triples that sum to 0.
        int n = a.length;
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j=i+1; j < n; j++)
            {
                for (int k=j+1; k < n; k++)
                {
                    if (0 == a[i] + a[j] + a[k])
                    {cnt++;}
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}

import edu.princeton.cs.algs4.*;

public class Quick
{
    public static void sort(Comparable[] a)
    {
        StdRandom.shffle(a);    //Eliminate dependence on input.
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) {return;}
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int Quick(Comparable[] a, int lo, int hi)
    {   //Partition into a[lo..i-1], a[i], a[i+1, hi]
        int i = lo, j = hi+1; //left and right scan indices.
        

    }
}

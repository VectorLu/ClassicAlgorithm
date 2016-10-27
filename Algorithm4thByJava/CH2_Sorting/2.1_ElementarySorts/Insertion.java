public class Insertion
{
    public static void sort(Comparable[] a)
    {   //Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++)
        {
            for (int j = i; j>0 && less(a[j], a[j-1]); )
        }
    }
}

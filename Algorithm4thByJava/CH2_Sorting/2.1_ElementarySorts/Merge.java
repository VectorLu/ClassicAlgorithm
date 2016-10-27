public class Merge
{
    private static Comparable[] aux;

    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {   //Merge a[lo..mid] with a[mid+1..hi]
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {aux[k] = a[k];}

        for (int k = lo; k <= hi; k++) //Merge back to a[lo..hi].
        {
            if (i > mid){a[k] = aux[j++];}
            else ()
        }
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo){return;}
        int mid = lo + (hi - lo)/2;

    }
}

public class Merge
{
    private static Comparable[] aux;

    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) {return;}
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi)
    {   //Merge a[lo..mid] with a[mid+1..hi]
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {aux[k] = a[k];}

        for (int k = lo; k <= hi; k++) //Merge back to a[lo..hi].
        {
            if (i > mid) {a[k] = aux[j++];}
            else if (j > hi) {a[k] = aux[i++];}
            else if (less(a[j], a[i])) {a[k] = aux[j++];}
            else {a[k] = aux[i++];}
        }
    }
}

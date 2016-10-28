import java.util.Comparator;
public class MergeBU
{
    private Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {aux[k] = a[k];}

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) {a[k] = aux[j++];}
            else if (j > hi) {a[k] = aux[i++];}
            else if (less(a[j], a[i])) {a[k] = aux[j++];}
            else {a[k] = aux[i++];}
        }
    }

    public static void sort(Comparable[] a)
    {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) //sz: subarray size
        {
            for (int lo = 0; lo < N-sz; lo += sz+sz)
            {
                int mid = lo + sz - 1;
                int hi = Math.min(lo+sz+sz-1, N-1);
                merge(a, lo, mid, hi);
            }
        }
    }
}

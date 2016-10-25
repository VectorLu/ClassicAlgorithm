import edu.princeton.cs.algs4.*;

public class Test
{
    public static void main(String[] args) {
        int n = StdIn.readInt();
        WeightedQuickUnionUF wuf = new WeightedQuickUnionUF(n);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (wuf.connected(p, q)){continue;}
            wuf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(wuf.count() + "components");
    }
}

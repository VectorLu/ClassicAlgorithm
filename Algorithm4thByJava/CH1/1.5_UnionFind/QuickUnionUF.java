import edu.princeton.cs.algs4.*;

public class QuickUnionUF
{
    private int[] id;
    private int count;

    public QuickUnionUF(int n)
    {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++)
        {id[i] = i;}
    }

    public int count()
    {return count;}

    public boolean connected(int p, int q)
    {return find(p)==find(q);}

    private int find(int p)
    {
        while(p != id[p])
        {p = id[p];}
        return p;
    }

    public void union(int p, int q)
    {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {return;}

        id[pRoot] = qRoot;

        count--;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickUnionUF uf = new QuickUnionUF(n);
        while(!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) {continue;}
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }
}

public class QuickFindUF
{
    private int[] id;
    private int count;

    public UF(int n)
    {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++)
        {id[i] = i;}
    }

    public int count()
    {return count;}

    public boolean connected(int p, int q)
    {return find(p) == find(q);}

    public int find(int p)
    {return id[p];}

    public void union(int p, int q)
    {   // Put p and q to the same component.
        int pID = find(p);
        int qID = find(q);

        // Nothing to do if p and q are already in
        // the same component.
        if (pID == qID) {return;}

        // Rename p's component to q's name.
        for (int i = 0; i < id.length; i++)
        {
            if (id[i] == pID) {id[i] = qID;}
        }
        count--;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt(); // Read number of sites.
        UF uf = new UF(n);
        while(!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p, q)){continue;}
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }

}

public class UF
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
    {;}

    public void union(int p, int q)
    {;}

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

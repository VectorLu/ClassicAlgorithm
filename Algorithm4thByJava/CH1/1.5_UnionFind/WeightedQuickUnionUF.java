import edu.princetion.cs.algs4.*;
public class WeightedQuickUnionUF
{
    private int[] id;   // parent link(site indexed)
    private int[] size; // size of component for roots(site indexed)
    private int count;  // number of components

    public WeightedQuickUnionUF(int n)
    {
        count = n;
        id = new id[n];
        for (int i = 0; i < n; i++)
        {id[i] = i;}
        for (int i = 0; i < n; i++)
        {size[i] = 1;}
    }

    public int count()
    {return count;}

    public boolean connected(int p, int q)
    {return find(p)==find(q);}

    private int find(int p)
    {   //Follow links to find a root.
        while(p != id[p])
        {p = id[p];}
        return p;
    }

    public void union(int p, int q)
    {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot){return;}

        // Make smaller root point to the larger one.
        if (size[pRoot] < size[qRoot])
        {
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        }
        else
        {
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }

        count--;
    }
}

public class Multiway
{
    public static void merge(In[] streams)
    {
        int n = streams.length;
        IndexMinPQ<String> pq = new IndexMinPQ<String>(n);

        for (int i = 0; i < n; i++)
        {
            if (!streams[i].isEmpty())
            {
                pq.insert(i, streams[i].readString());
            }
        }

        while (!pq.isEmpty())
        {
            StdOut.println(pq.min());
            int i = pq.delMin();
            if (!streams[i].isEmpty())
            {
                pq.insert(i, streams[i].readString());
            }
        }
    }

    public static void main(String[] args) {
        int n = args.length;
        In[] streams = new In[n];
        for (int i = 0; i < n; i++)
        {
            streams[i] = new In(args[i]);
        }
        merge(streams);
    }
}

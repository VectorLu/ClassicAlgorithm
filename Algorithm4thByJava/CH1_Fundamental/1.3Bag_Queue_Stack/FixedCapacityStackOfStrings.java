import edu.princeton.cs.algs4.*;
public class FixedCapacityStackOfStrings
{
    private int N;
    private String[] a;

    public FixedCapacityStackOfStrings(int cap)
    {a = new String[cap];}

    public boolean isEmpty()
    {return 0 == N;}

    public int size()
    {return N;}

    public void push(String s)
    {a[N++] = s;}

    public String pop()
    {return a[--N];}

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {s.push(item);}
            else
            {
                if(!s.isEmpty())
                {StdOut.print(s.pop()+" ");}
            }
        }
        StdOut.println("(" + s.size() + "left on stack)");
    }
}

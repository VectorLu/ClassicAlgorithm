import edu.princeton.cs.algs4.*;

public class Whitelist
{
    public static void main(String[] args) {
        int[] w = In.readInts(args[0]);
        StaticSETofInts set = new StaticSETofInts();
        while(!StdIn.isEmpty())
        {
            int key = StdIn.readInts();
            if(!set.contains(key))
            {
                StdOut.println(key);
            }
        }
    }
}

import edu.princeton.cs.algs4.*;

public class TestAccumulator
{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int i = 0; i < n; i++)
        {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}

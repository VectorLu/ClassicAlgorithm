import edu.princeton.cs.algs4.*;

public class TestVisualAccumulator
{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(n, 1.0);
        for (int i = 0; i < n; i++)
        {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}

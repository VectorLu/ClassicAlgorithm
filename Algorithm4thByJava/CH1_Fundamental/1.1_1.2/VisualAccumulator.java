import edu.princeton.cs.algs4.*;
public class VisualAccumulator
{
    private double total;
    private int n;

    public VisualAccumulator(int trials, double max)
    {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double value)
    {
        n++;
        total += value;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(n, value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(n, total/n);
    }

    public double mean()
    {
        return total/n;
    }

    public String toString()
    {
        return "Mean (" + n + " values): " +
                String.format("%7.5f", mean());
    }
}

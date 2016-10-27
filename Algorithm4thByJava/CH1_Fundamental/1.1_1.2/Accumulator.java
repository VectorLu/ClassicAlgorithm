public class Accumulator
{
    private double total;
    private int n;


    public void addDataValue(double value)
    {
        n++;
        total += value;
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

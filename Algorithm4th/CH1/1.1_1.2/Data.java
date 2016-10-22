public class Data
{
    private final int month;
    private final int day;
    private final int year;

    public Data(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    public int month()
    {
        return month;
    }

    public int day()
    {
        return day;
    }

    public int year()
    {
        return year;
    }

    public String toString()
    {
        return month()+"/"+day()+"/"+year();
    }

    //To implement equals() is a hard job.
    public boolean equals(Object x)
    {
        if(this == x){return true;}
        if(x == null){return false;}
        if(this.getClass() != x.getClass())
        {return false;}
        Date that = (Data) x;
        if(that.month != this.month)
        {return false;}
        if(that.day != this.day)
        {return false;}
        if(that.year != this.year)
        {return false;}

        return true;
    }
}

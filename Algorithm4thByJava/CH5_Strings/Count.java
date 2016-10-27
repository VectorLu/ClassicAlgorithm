import edu.princeton.cs.algs4.*;

public class Count
{
    public static void main(String[] args) {
        Alphabet alpha = new Alphabet(args[0]);
        int R = alpha.R();
        int[] count = new int[R];

        String s = StdIn.readAll();
        int n = s.length();

        for (int i = 0; i < n; i++)
            if (alpha.contains(s.charAt(i)))
                count[alpha.toIndex(s.charAt(i))]++;

        for (int c = 0; c < R; c++)
            StdOut.println(alpha.toChar(c) + " " +
                            count[c]);
    }
}

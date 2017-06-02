import edu.princeton.cs.algs4.*;

public class FrequencyCounter {

  // Do not instantiate.
  private FrequencyCounter() {}

  public static void main(String[] args) {
    int dinstinct = 0;
    int words = 0;
    int minLen = Integer.parseInt(args[0]);    // key-length cutoff
    ST<String, Integer> st = new ST<String, Integer>();

    // compute frequency counts
    while (!StdIn.isEmpty()) {
      // Build symbol table and count frequencies.
      String key = StdIn.readString();
      if (word.length() < minLen) {continue;}
      words++;
      if (st.contains(key)) {
        st.put(key, st.get(key) + 1);
      }
      else {
        st.put(key, 1);
        dinstinct++;
      }
    }

    // find a key with the highest frequency count
    String max = "";
    st.put(max, 0);
    for (String word : st.keys()) {
      if (st.get(word) > st.get(max)) {max = word;}
    }

    StdOut.println(max + " " + st.get(max));
    StdOut.println("dinstinct = " + dinstinct);
    StdOut.println("words     = " + words);
  }
}

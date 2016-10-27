import java.util.Iterator;
import edu.princeton.cs.algs4.*;

public class Stack<Item> implements Iterable<Item>
{
    private class Node
    {
        Item item;
        Node next;
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;

        public boolean hasNext()
        {return current != null;}

        public void remove()
        {;}

        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private Node first;
    private int N;

    public boolean isEmpty()
    {
        return null == first;
    }

    public int size()
    {return N;}

    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator()
    {return new ListIterator();}

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {s.push(item);}
            else
            {
                if (!s.isEmpty())
                {StdOut.print(s.pop()+" ");}
            }
        }
        StdOut.println("(" + s.size() + "left on stack)");
    }
}

import java.util.Iterator;
import edu.princeton.cs.algs4.*;

public class Queue<Item> implements Iterable<Item>
{
    private Node first;
    private Node last;
    private int n;

    private class Node
    {   //nested class to define nodes
        Item item;
        Node next;
    }

    public boolean isEmpty(){return null == first;}

    public int size(){return n;}

    public void enqueue(Item item)
    {   // Add item to the end of the list.
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){first = last;}
        else{oldLast.next = last;}
        n++;
    }

    public Item dequeue()
    {   //Remove item from the beginning of the list.
        Item item = first.item;
        first = first.next;
        if (isEmpty()){last = null;}
        n--;
        return item;
    }

    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;

        public boolean hasNext(){return current!=null;}
        public void remove(){;}
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();
        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {q.enqueue(item);}
            else
            {
                if(!q.isEmpty())
                {StdOut.print(q.dequeue() + " ");}
            }
        }
        StdOut.println("(" + q.size() + "left on queue)");
    }
}

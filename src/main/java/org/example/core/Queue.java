package org.example.core;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

    int N=0;
    private final LinkedList<Item> q;

    public Queue() {
        q = new LinkedList<>();
    }

  public   void enqueue(Item item)
    {
       q.insertAtTheEnd(item);
       N++;
    }
    public Item dequeue()
    {
        if(N==0)throw new RuntimeException("EMPTY QUEUE");
        N--;
        return q.remove();
    }
   public int size(){return N;}


    @Override
    public Iterator<Item> iterator() {
        return q.iterator();
    }

    public boolean empty() {
        return N==0;
    }
}

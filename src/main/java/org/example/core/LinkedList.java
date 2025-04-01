package org.example.core;

import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item> {

    int N=0;
    Node first;
    Node last;

    private class Node{
        Node next;
        Item value;
    }

    void insertAtTheBeginning(Item item)
    {
        if(first==null)
        {
            first = new Node();
            first.value=item;
            last=first;
        }else{
            Node t = first;
            first = new Node();
            first.value=item;
            first.next=t;
        }
        N++;
    }

    void insertAtTheEnd(Item item)
    {
        if(last==null)
        {
            last = new Node();
            last.value=item;
            first=last;
        }else{
            Node t= last;
            last =new Node();
            last.value=item;
            t.next=last;

        }
        N++;
    }

    Item remove(){
        if(N==0)throw new RuntimeException("no item");
        Item item = first.value;
        first=first.next;
        if(first==null)last=null;
        N--;
        return item;
    }

public int size(){return N;}

    public Item head() {
        return first.value;
    }

    public Item tail() {
        return last.value;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedListIterator(first);
    }

    private class LinkedListIterator implements Iterator<Item> {
        Node first;

        public LinkedListIterator(Node first)
        {
            this.first=first;
        }

        @Override
        public boolean hasNext() {
            return first !=null;
        }

        @Override
        public Item next() {
            Item item= first.value;
            first = first.next;
            return item;
        }
    }
}

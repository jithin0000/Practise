package org.example.core;

import java.util.Iterator;

public class ArrayStack<Item> implements Iterable<Item> {

    private int N;
    private Item[] a;
    private final int DEFAULT_SIZE=10;

    public ArrayStack() {
        a = (Item[]) new Object[DEFAULT_SIZE];
    }

    void push(Item item)
    {
        if( N==a.length) resize(a.length*2);
        a[N++]=item;
    }
    Item pop(){
        Item item = a[--N];
        if(a.length/4==N)resize(a.length/2);
        return  item;

    }

    private void resize( int max) {

        Item[] t = (Item[]) new Object[max];
        if (N >= 0) System.arraycopy(a, 0, t, 0, N);
        a=t;
    }

    public int size(){return N;}

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator(a);
    }

    private class StackIterator implements Iterator<Item> {
        private final Item[] array;
        int N=0;

        public StackIterator(Item[] a) {
            this.array = a;
            this.N=a.length;
        }

        @Override
        public boolean hasNext() {
            return N!=0;
        }

        @Override
        public Item next() {
            Item item = array[0];
            N--;
            return item;
        }
    }
}

package org.example.core;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private final LinkedList<Item> list = new LinkedList<>();

    public void add(Item item)
    {
        list.insertAtTheBeginning(item);
    }
    int size(){return list.size();}


    @Override
    public Iterator<Item> iterator() {
        return list.iterator();
    }
}

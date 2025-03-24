package org.example.core;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private final LinkedList<Item> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(Item item) {
        list.insertAtTheBeginning(item);
    }

    public Item pop() {
        if (list.size() == 0) throw new RuntimeException("EMPTY STACK");
        return list.remove();
    }

    public int size() {
        return list.size();
    }

    @Override
    public Iterator<Item> iterator() {
        return list.iterator();
    }
}

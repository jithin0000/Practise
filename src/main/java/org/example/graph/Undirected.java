package org.example.graph;

import org.example.core.Bag;
import org.example.core.Stack;

public class Undirected implements Graph {

    int V,E=0;
    Bag<Integer>[] adj;

    public Undirected(int v) {
        this.V=v;
        adj = (Bag<Integer>[]) new Bag[v];
        for (int i = 0; i < v; i++) {
           adj[i] = new Bag<>();
        }
    }

    @Override
    public int V() {
        return V;
    }

    @Override
    public int E() {
        return E;
    }

    @Override
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    @Override
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}

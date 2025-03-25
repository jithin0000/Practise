package org.example.graph.path;

public interface Path {

    boolean hasPathTo(int v);
    Iterable<Integer> path(int v);

    int count();
}

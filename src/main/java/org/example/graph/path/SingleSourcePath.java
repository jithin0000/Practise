package org.example.graph.path;

import org.example.core.Stack;
import org.example.graph.Graph;
import org.example.graph.Undirected;

public class SingleSourcePath implements Path {

    boolean[] marked;
    int[] edgeTo;
    private int s;

    public SingleSourcePath(Graph G, int s) {
        int V = G.V();
        marked = new boolean[V];
        this.s=s;
        edgeTo = new int[V];
        dfs(G, s);
    }

    private void dfs(Graph G, int s) {
        marked[s]=true;
        for (Integer w: G.adj(s)) {
            if(!marked[w])
            {
                edgeTo[w]=s;
                dfs(G,w);
            }
        }

    }

    @Override
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    @Override
    public Iterable<Integer> path(int v) {
        if(!hasPathTo(v))return null;
        Stack<Integer> stack = new Stack<>();
        for (int x=v; x!=s ; x=edgeTo[x]) {
           stack.push(x);
        }
        stack.push(s);
        return stack;
    }

    @Override
    public int count() {
        return edgeTo.length;
    }
}

package org.example.graph.path;

import org.example.core.Queue;
import org.example.core.Stack;
import org.example.graph.Graph;

public class BFS implements Path {
    private boolean[] marked;
    private int[] edgeTo;
    private  final int s;

    public BFS(Graph G, int s) {
        this.s=s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(s);
        marked[s]=true;
        while (!queue.empty())
        {
            Integer item = queue.dequeue();
            for (Integer v : G.adj(item)) {
                if(!marked[v])
                {
                    marked[v]=true;
                    edgeTo[v]=s;
                    queue.enqueue(v);
                }
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
        return 0;
    }
}

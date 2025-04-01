package org.example.graph.path;

import org.example.graph.Graph;
import org.example.graph.Undirected;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BFSTest {

    BFS SUT ;

    @BeforeEach
    void setUp() {
        Graph G = new Undirected(6);
        G.addEdge(0,2);
        G.addEdge(2,1);
        G.addEdge(2,3);
        G.addEdge(3,4);
        G.addEdge(3,5);
        SUT = new BFS(G,0);
    }

    @Test
    void testPathTO() {
        Iterable<Integer> path = SUT.path(5);
        for (Integer i : path) {
            System.out.println(i);
        }
    }

}
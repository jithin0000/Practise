package org.example.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UndirectedTest {

    private Undirected graph;

    @BeforeEach
    void setUp() {
        graph = new Undirected(5);
    }

    @Test
    void testNumberOfVertices() {
        assertEquals(5, graph.V());
    }

    @Test
    void testInitialNumberOfEdges() {
        assertEquals(0, graph.E());
    }

    @Test
    void testAddEdge() {
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);

        assertEquals(2, graph.E());
    }

    @Test
    void testAdjacencyList() {
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        Iterable<Integer> adj = graph.adj(0);
        assertTrue(adj.iterator().hasNext());
    }

    @Test
    void testAdjacencySymmetry() {
        graph.addEdge(2, 3);

        assertTrue(graph.adj(2).iterator().hasNext());
        assertTrue(graph.adj(3).iterator().hasNext());
    }

}
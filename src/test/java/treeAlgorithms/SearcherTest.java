package treeAlgorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearcherTest {

    private Node testRoot;

    @Before
    public void setup(){
        //     9
        //    / \
        //   4  17
        //  / \   \
        // 3   6    22
        //    / \    /
        //   5   7  20

        Node n5 = new Node(5);
        Node n7 = new Node(7);
        Node n6 = new Node(n5, n7, 6);
        Node n3 = new Node(3);
        Node n4 = new Node(n3, n6, 4);

        Node n20 = new Node(20);
        Node n22 = new Node(n20, null, 22);
        Node n17 = new Node (null, n22, 17);

        Node n9 = new Node(n4, n17, 9);
        testRoot = n9;
    }

    @Test
    public void testFindLowestNode() throws Exception {
        Node node = Searcher.findkthLowestNode(testRoot, 0);
        assertEquals(3, node.getValue());
    }

    @Test
    public void testFindSecondLowestNode() throws Exception {
        Node node = Searcher.findkthLowestNode(testRoot, 1);
        assertEquals(4, node.getValue());
    }

    @Test
    public void testFindThirdLowestNode() throws Exception {
        Node node = Searcher.findkthLowestNode(testRoot, 2);
        assertEquals(5,node.getValue());
    }

    @Test
    public void testFindFourthLowestNode() throws Exception {
        Node node = Searcher.findkthLowestNode(testRoot, 3);
        assertEquals(6,node.getValue());
    }

    @Test
    public void testFindFifthLowestNode() throws Exception {
        Node node = Searcher.findkthLowestNode(testRoot, 4);
        assertEquals(7,node.getValue());
    }
    @Test
    public void testSizeMethod(){
        int size = Searcher.findSizeOfTree(testRoot);
        assertEquals(9, size);
    }
}
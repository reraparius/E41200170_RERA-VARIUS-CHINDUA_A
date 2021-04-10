/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author reraparius
 */
public class GraphApp {
    public static void main (String [] args) {
        
        Graph thegraph = new Graph();
        
        thegraph.addvertex ('A');
        thegraph.addvertex ('B');
        thegraph.addvertex ('C');
        thegraph.addvertex ('D');
        thegraph.addvertex ('E');
        
        thegraph.addedge(0, 1);
        thegraph.addedge(1, 2);
        thegraph.addedge(2, 3);
        thegraph.addedge(3, 4);
        
        thegraph.display();
               
    }
    
    public void bfs() {
        System.out.println("Visit by using "+" BFS algorithm");
        vertexList[0].wasVisited = true;
        displayVertex (0);
        theQueue.insert(0);
        
        int v2;
        
        while (!theQueue.isEmpty()) {
            int v1 = (int) theQueue.remove();
            while ((v2 = getAdjUnivisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = 
                true;
                displayVertex(v2);
                theQueue.insert(v2);
        }
        System.out.println("");
        resetFlags();
        } 
    }
}

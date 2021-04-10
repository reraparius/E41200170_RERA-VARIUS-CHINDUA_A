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
public class Graph {
    private final int max_verts = 20;
    private Vertex vertexlist[];
    private int adjmat [][];
    private int nverts;
    private Queue theQueue;
    
    public void bfs() {
        System.out.print("Visit by using "+" BFS algorithm");
        vertexlist[0].wasVisited = true;
        displayvertex (0);
        theQueue.insert(0);
        
        int v2;
        
        while (!theQueue.isempty()) {
            int v1 = (int) theQueue.remove();
            while ((v2 = getadjunivisitedvertex(v1)) != -1) {
                vertexlist[v2].wasVisited = 
                true;
                displayvertex(v2);
                theQueue.insert(v2);
        }
        System.out.println("");
        resetflags();
        } 
    }
    
    public Graph () {
        vertexlist = new Vertex[max_verts];
        adjmat = new int [max_verts][max_verts];
        nverts = 0;
        for(int i = 0; i < max_verts; i++) {
            for (int j = 0; j < max_verts; j++){
                adjmat[i][j] = 0;
            }
    }
        theQueue = new Queue (max_verts);
    }
    
        
    public void addvertex (char label) {
        vertexlist [nverts++] =
        new Vertex(label);        
    }
    public void addedge (int start, int end){
        adjmat[start][end] = 1;
        adjmat[end][start] = 1;
    }
    public void display() {
        System.out.println("Adjecency");
        for (int row = 0; row < nverts; row++){
            for (int col = 0; col < row; col++){
                if (adjmat[row][col] == 1){
                System.out.println(vertexlist[row].label + "--" + vertexlist[col].label);
            }
            }
        }
        System.out.println("");
    }
    public void displayvertex(int v) {
        System.out.println(vertexlist[v].label+" ");
    }
    public int getadjunivisitedvertex(int v) {
        for (int i = 0; i < nverts; i++) {
            if(adjmat[v][i] == 1 && vertexlist[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }
    private void resetflags () {
        for (int i = 0; i < nverts; i++) {
            vertexlist[i].wasVisited = false;
        }
    }
}
}

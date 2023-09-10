import java.util.ArrayList;

public class Main {

    public static void main( String[] args){
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        // graph.addEdge(4, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(0, 3);
        

        graph.printAdjList();

        graph.bfs(0);
        // ArrayList<ArrayList<Integer>> nr = graph.adjList;
        // System.out.println(nr);

        graph.dfs(0);
    }

    

}

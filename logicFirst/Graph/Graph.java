import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph{
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph(int v){
        for(int i=0; i<v; ++i){
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    
    public void printAdjList(){
        for(int i=0; i<adjList.size(); ++i){
            System.out.println("Adj list of vertex "+ i);

            for (int j=0; j< adjList.get(i).size(); ++j){
                System.out.print( " "+ adjList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void bfs(int v){
        int V = adjList.size();
        System.out.println(V);
        boolean visitedArr[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visitedArr[v] = true;

        while(!queue.isEmpty()){
            int vertex = queue.remove();
            System.out.print(vertex + " ");
            for (int i=0; i< adjList.get(vertex).size(); ++i){
                int av = adjList.get(vertex).get(i);

                if(!visitedArr[av]){
                    visitedArr[av] = true;
                    queue.add(av);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int v){
        int V = adjList.size();
        boolean visitedArr[] = new boolean[V];
        dfs(v, visitedArr);
        System.out.println();
    }

    public void dfs(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");

        for (int i=0; i< adjList.get(v).size();++i){
            int vertex = adjList.get(v).get(i);

            if(!visited[vertex])
                dfs(vertex, visited);
        }
    }
}
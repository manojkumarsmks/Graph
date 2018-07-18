// Graph reprensetation as a list
import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {
	
	int vertexCount = 0;
	LinkedList<Integer> listArray[];
	
	public AdjacencyList(int vertexCount) {
		this.vertexCount = vertexCount;
		listArray = new LinkedList[vertexCount];
		
		//Initalize the linkedlist for each vertex
		for (int i = 0; i < this.vertexCount; i++) {
			listArray[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int src, int dst) {
		// Only this statement if its a directed graph
		listArray[src].add(dst);
		
		// if its a undirected graph
		listArray[dst].add(src);
	}
	
	public void printGraph() {
		for (int i = 0; i < listArray.length; i++) {
			System.out.println("Vertex is "+listArray[i].get(0));
			for (int j = 1; j < listArray[i].size(); j++) {
				System.out.println("All the edges are "+listArray[i].get(j));
			}
		
		}
	}
	
	
	public static void main(String[] args) {
		AdjacencyList adjacencyList = new AdjacencyList(5);
		adjacencyList.addEdge(0, 1);
		adjacencyList.addEdge(0, 4);
		adjacencyList.addEdge(1, 2);
		adjacencyList.addEdge(1, 3);
		adjacencyList.addEdge(1, 4);
		adjacencyList.addEdge(2, 3);
		
		adjacencyList.printGraph();
	}

}

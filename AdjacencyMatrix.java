// Graph reprensetaion using Adjacency Matrix
public class AdjacencyMatrix {
	
	private boolean adjacencyMatrix[][];
	
	private int vertexCount;
	
	public AdjacencyMatrix(int vertexCount) {
		this.vertexCount = vertexCount;
		this.adjacencyMatrix = new boolean[this.vertexCount][this.vertexCount];
	}
	
	public void addEdge(int u , int v) {
		if((u >= 0 &&  u <vertexCount) && (v >= 0 && v <vertexCount)) {
			adjacencyMatrix[u][v] = true;
			adjacencyMatrix[v][u] = true;
		}
	}
	
	public void removeEdge(int u, int v) {
		if((u >= 0 &&  u <vertexCount) && (v >= 0 && v <vertexCount)) {
			adjacencyMatrix[u][v] = false;
			adjacencyMatrix[v][u] = false;
		}
	}
	
	public boolean isEdge(int u, int v) {
		if((u >= 0 &&  u <vertexCount) && (v >= 0 && v <vertexCount)) {
			return adjacencyMatrix[u][v];
		}
		return false;
	}
	
	

}

package classes;

import java.util.HashMap;
import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;
    public Vertex(V data) {
        this.data = data;
        adjacentVertices = new HashMap<>();
    }
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination,weight);
    }
    public V getData() {
        return data;
    }
    public Map<Vertex<V>,Double> getAdjacentVertices() {
        return adjacentVertices;
    }
    public boolean hasAdjacentVertices(Vertex<V> destination) {
        return adjacentVertices.containsKey(destination);
    }
    public double getWeightTo(Vertex<V> destination) {
        return adjacentVertices.get(destination);
    }
    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

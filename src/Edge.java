package ir.aut;

public class Edge implements Comparable<Edge> {
    public Node start;
    public Node end;
    public double cost;

    public Edge(String start, String end) {
        Node node = new Node(start);
        Node node1 = new Node(end);
        this.start = node;
        this.end = node1;
    }

    public Edge(String start, String end, double cost) {
        Node node = new Node(start);
        Node node1 = new Node(end);
        this.start = node;
        this.end = node1;
        this.cost = cost;
    }


    @Override
    public int compareTo(Edge o) {
        if (this.cost > o.cost)
            return 1;
        if (this.cost < o.cost)
            return -1;
        else return 0;
    }
}
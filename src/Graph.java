package ir.aut;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    public ArrayList<Node> nodes;

    public Graph() {
        nodes = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).edgeList = new LinkedList<>();
        }
    }

    public void addNode(String name) {
        Node node = new Node(name);
        nodes.add(node);
    }

    public void addNode2(String name,int huristic) {
        Node node=new Node(name,huristic);
        nodes.add(node);
    }



    public void addEdge(String start, String end) {
        Edge edge = new Edge(start, end);
        Edge edge1 = new Edge(end, start);
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            if (node.name.equals(start)) {
                node.edgeList.add(edge);
                nodes.set(i, node);
//                nodes.remove(i);
//                nodes.add(i,node);
            }
            if (node.name.equals(end)) {
                node.edgeList.add(edge1);
                nodes.set(i, node);
            }
        }
    }




    public void addEdge2(String start, String end,double cost) {
        Edge edge = new Edge(start, end,cost);
        Edge edge1 = new Edge(end, start,cost);
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            if (node.name.equals(start)) {
                node.edgeList.add(edge);
                nodes.set(i, node);
//                nodes.remove(i);
//                nodes.add(i,node);
            }
            if (node.name.equals(end)) {
                node.edgeList.add(edge1);
                nodes.set(i, node);
            }
        }
    }


    public void print() {
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);

            System.out.println("node:" + node.name);
            System.out.println("adjList:");
            for (int j = 0; j < node.edgeList.size(); j++) {

                System.out.println(node.edgeList.get(j).end.name);
            }
//            node.edgeList.get()
//            System.out.println(node.);
//
//            System.out.println(nodes.get(i).edgeList);
        }
    }

    public Node getStartNode() {
        return this.nodes.get(0);
    }

    public Node getLastNode() {
        return this.nodes.get(19);
    }
}



package ir.aut;

import java.util.LinkedList;
import java.util.List;

public class Node {

    public String name;
    public LinkedList<Edge> edgeList;
    public int huristic;
    public int pathcost;

    public Node(String name){
        this.name=name;
        edgeList=new LinkedList<>();
    }

    public Node(String name,int huristic){
        this.name=name;
        edgeList=new LinkedList<>();
        this.huristic=huristic;

    }


} 
package ir.aut;

import java.util.LinkedList;
import java.util.List;



public class Problem {

//    private static   Node goalState ;
//    private   Node startState;
//    Problem(String start,String goal){
//        goalState=new Node(goal);
//        startState=new Node(start);
//    }

    public static Node getInitialState(Graph graph) {

        return graph.getStartNode();
    }

    public static boolean goalTest(Node node) {
        if (node.name.equals("Bucharest"))
            return true;
        else return false;
    }

    public static List<Edge> getActions(Node node){
        return node.edgeList;
    }

    public static Node result(Node start,Edge edge){

        return edge.end;
    }

    public static double getCost(){return 1;}
} 